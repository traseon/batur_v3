package com.traceon.batur.data.repo

import com.traceon.batur.data.network.NetworkConfig
import com.traceon.batur.data.response.*
import io.reactivex.Observable
import retrofit2.Call

class RemoteRepository {
    private val api = NetworkConfig.getInstan()
    fun login(username: String, password: String): Observable<ResponseLogin> {
        return api.login(username, password)
    }

    fun ubahPassword(
        database: String,
        id: String,
        password: String,
        password_baru: String
    ): Call<ResponseUpdate> {
        return api.ubah_password(database, id, password, password_baru)
    }

    fun getDesa(
        database: String,
        area_id: String,
        staff_id: String
    ): Observable<ResponseDesa> {
        return api.get_desa(database, area_id, staff_id)
    }

    fun getArea(
        database: String,
        mu_id: String,
        staff_id: String
    ): Observable<ResponseArea> {
        return api.get_area(database, mu_id, staff_id)
    }

    fun getManagementUnit(
        database: String,
        staff_id: String
    ): Observable<ResponseManagementUnit> {
        return api.get_manajemen_unit(database, staff_id)
    }

    fun getBank(
        database: String?
    ): Observable<ResponseBank>{
        return api.get_bank(database)
    }

    fun getPetani(
        database: String?,
        desa_id: String?,
        petani_id: String?
    ): Observable<ResponsePetani> {
        return api.get_petani(database, desa_id, petani_id)
    }

    fun getReferral(
        database: String?, staff_id: String?
    ): Observable<ResponseReferral> {
        return api.get_kode_referal(database, staff_id)
    }

    fun getLahan(
        database: String, petani_id: String
    ): Observable<ResponseLahan> {
        return api.get_lahan_multi(database, petani_id)
    }

    fun getKomoditas(
        database: String?,
        sub_kategori_komoditas_id: String?
    ): Observable<ResponseKomoditas> {
        return api.get_komoditas(database, sub_kategori_komoditas_id)
    }

    fun getBaseline(
        database: String?, petani_id: String?
    ): Observable<ResponseBaseline> {
        return api.get_baseline_multi(database, petani_id)
    }

    fun getDeleteImage(database: String, file_path: String): Observable<ResponseUpdate> {
        return api.delete_image(database, file_path)
    }

    fun getProfile(
        database: String,
        table_id: String,
        tim_medis_id: String,
        user_id: String,
        token: String
    ): Call<List<ResponseProfile>> {
        return api.request_profil(database, table_id, tim_medis_id, user_id, token)
    }

    fun getPrioritasVisit(database: String?, desa_id: String?): Observable<ResponsePrioritasVisit> {
        return api.get_prioritas_visit(database, desa_id)
    }

    fun getPrioritasVisitBaru(
        database: String?,
        desa_id: String?,
        frequent: String?
    ): Observable<ResponsePrioritasVisit> {
        return api.get_prioritas_visit_new(database, desa_id, frequent)
    }

    fun getIncidentalVisit(database: String?, kode: String?): Observable<ResponseIncidentalVisit> {
        return api.get_incidental_visit(database, kode)
    }

    fun getChartVisit(database: String?, desa_id: String?): Observable<ResponseChart> {
        return api.get_petani_program_visit(database, desa_id)
    }

    fun getProgram(database: String?): Observable<ResponseProgram> {
        return api.get_program(database)
    }

    fun getProgramBaru(database: String?, program_id: String?): Observable<ResponseProgramBaru> {
        return api.get_program_baru(database, program_id)
    }

    fun getFase(database: String, group_komoditas_id: String): Observable<ResponseFase> {
        return api.get_fase(database, group_komoditas_id)
    }

    fun getCekArea(
        database: String?,
        group_komoditas_id: String?,
        fase_id: String?
    ): Observable<ResponseCheckArea> {
        return api.get_check_area(database, group_komoditas_id, fase_id)
    }

    fun getCheckPoint(database: String, check_area_id: String): Observable<ResponseCheckPoint> {
        return api.get_check_point(database, check_area_id)
    }

    fun getKomoditasVisit(
        database: String?,
        sub_kategori_komoditas_id: String?,
        id_sub_lahan: String?,
        kode: String?
    ): Observable<ResponseKomoditasVisit> {
        return api.get_komoditas_baseline(database, sub_kategori_komoditas_id, id_sub_lahan, kode)
    }

    fun getKomoditasBaru(
        database: String?,
        group_komoditas_id: String?
    ): Observable<ResponseKomoditasBaru> {
        return api.get_komoditas_baru(database, group_komoditas_id)
    }

    fun showDashboardVisit(
        database: String?,
        desa_id: String?
    ): Observable<ResponseDashboardVisit> {
        return api.show_grafik_petani_program_visit(database, desa_id)
    }

    fun getFrequentVisit(
        database: String?,
        desa_id: String?
    ): Observable<ResponseFrequent> {
        return api.get_table_frequent_visit(database, desa_id)
    }
}