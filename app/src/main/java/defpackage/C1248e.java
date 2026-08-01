package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1248e extends AbstractC1487e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C9223e f3946e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C3318e f3947e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final String[] f3945e = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final String[] f3942e = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final String[] f3944e = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final String[] f3937e = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final String[] f3943e = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final String[] f3936e = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final String[] f3935e = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final String[] f3938e = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final String[] f3940e = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final String[] f3941e = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final String[] f3939e = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public C1248e(C15398e c15398e) {
        super(c15398e);
        this.f3947e = new C3318e(((C6936e) this.f36443e).f14215e);
        ((C6936e) this.f36443e).getClass();
        this.f3946e = new C9223e(this, ((C6936e) this.f36443e).f14225e);
    }

    /* renamed from: eّؑۚ, reason: contains not printable characters */
    public static final void m502e(ContentValues contentValues, Object obj) {
        AbstractC9528e.purchase("value");
        AbstractC9528e.startapp(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* renamed from: eّؕ۠, reason: contains not printable characters */
    public static final String m503e(List list) {
        return list.isEmpty() ? BuildConfig.FLAVOR : AbstractC5087e.m1746extends(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    /* renamed from: eٌؑ, reason: contains not printable characters */
    public final void m504e(String str, String str2) {
        AbstractC9528e.purchase(str);
        AbstractC9528e.purchase(str2);
        mo2250e();
        m613e();
        try {
            m533e().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            C6936e c6936e = (C6936e) this.f36443e;
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.license("Error deleting user property. appId", C13879e.m3689e(str), c6936e.f14202e.metrica(str2), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* renamed from: eّؑۛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m505e(java.lang.String r19, defpackage.C1157e r20, int r21) {
        /*
            r18 = this;
            defpackage.AbstractC9528e.purchase(r19)
            r18.mo2250e()
            r18.m613e()
            java.lang.String r0 = " AND NOT "
            java.lang.String r1 = "app_id=?"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r18.m533e()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r4 = "upload_queue"
            java.lang.String r5 = "rowId"
            java.lang.String r6 = "app_id"
            java.lang.String r7 = "measurement_batch"
            java.lang.String r8 = "upload_uri"
            java.lang.String r9 = "upload_headers"
            java.lang.String r10 = "upload_type"
            java.lang.String r11 = "retry_count"
            java.lang.String r12 = "creation_timestamp"
            java.lang.String r13 = "associated_row_id"
            java.lang.String r14 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r6 = r20
            java.util.List r6 = r6.f3741e     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = m503e(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r7 = r18.m517e()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r6.length()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r8 + 17
            int r9 = r7.length()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String[] r7 = new java.lang.String[]{r19}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r10 = "creation_timestamp ASC"
            if (r21 <= 0) goto L66
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r11 = r0
            goto L67
        L66:
            r11 = r2
        L67:
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
        L72:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            if (r1 == 0) goto Lb9
            r1 = 0
            long r5 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 2
            byte[] r7 = r2.getBlob(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 3
            java.lang.String r8 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 4
            java.lang.String r9 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 5
            int r10 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 6
            int r11 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 7
            long r12 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 8
            long r14 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 9
            long r16 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r3 = r18
            r4 = r19
            eٟٕٓ r1 = r3.m555e(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            if (r1 == 0) goto L72
            r0.add(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            goto L72
        Lb5:
            r0 = move-exception
            goto Lbc
        Lb7:
            r0 = move-exception
            goto Lbf
        Lb9:
            r3 = r18
            goto Ld5
        Lbc:
            r3 = r18
            goto Ldc
        Lbf:
            r3 = r18
            java.lang.Object r1 = r3.f36443e     // Catch: java.lang.Throwable -> Ldb
            eؚؖٞ r1 = (defpackage.C6936e) r1     // Catch: java.lang.Throwable -> Ldb
            eٍؙٓ r1 = r1.f14227e     // Catch: java.lang.Throwable -> Ldb
            defpackage.C6936e.yandex(r1)     // Catch: java.lang.Throwable -> Ldb
            eِٔۙ r1 = r1.f27502e     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r19
            r1.metrica(r5, r0, r4)     // Catch: java.lang.Throwable -> Ldb
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Ldb
        Ld5:
            if (r2 == 0) goto Lda
            r2.close()
        Lda:
            return r0
        Ldb:
            r0 = move-exception
        Ldc:
            if (r2 == 0) goto Le1
            r2.close()
        Le1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m505e(java.lang.String, eٟؒٚ, int):java.util.List");
    }

    /* renamed from: eٟؑۨ, reason: contains not printable characters */
    public final boolean m506e() {
        return ((C6936e) this.f36443e).f14225e.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* renamed from: eٕؒٓ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m507e(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f36443e
            r1 = r0
            eؚؖٞ r1 = (defpackage.C6936e) r1
            defpackage.AbstractC9528e.purchase(r13)
            r12.mo2250e()
            r12.m613e()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1000"
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r12.m533e()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r9 = "rowid"
            r1.getClass()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            boolean r2 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r2 == 0) goto L9c
        L3f:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2 = 1
            java.lang.String r2 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r2 != 0) goto L4d
            java.lang.String r2 = ""
        L4d:
            r5 = r2
            goto L52
        L4f:
            r0 = move-exception
            r4 = r13
            goto L8a
        L52:
            r2 = 2
            long r7 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2 = 3
            java.lang.Object r9 = r12.m540e(r11, r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r9 != 0) goto L73
            eٍؙٓ r2 = r1.f14227e     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            defpackage.C6936e.yandex(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            eِٔۙ r2 = r2.f27502e     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            java.lang.String r3 = "Read invalid user property value, ignoring it. appId"
            eٖٓۙ r4 = defpackage.C13879e.m3689e(r13)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2.vip(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            goto L7c
        L70:
            r0 = move-exception
            r13 = r0
            goto La2
        L73:
            eَؕؔ r3 = new eَؕؔ     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            r0.add(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
        L7c:
            boolean r13 = r11.moveToNext()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            if (r13 != 0) goto L83
            goto L9c
        L83:
            r13 = r4
            goto L3f
        L85:
            r0 = move-exception
            goto L8a
        L87:
            r0 = move-exception
            r4 = r13
            r13 = r0
        L8a:
            eٍؙٓ r13 = r1.f14227e     // Catch: java.lang.Throwable -> L70
            defpackage.C6936e.yandex(r13)     // Catch: java.lang.Throwable -> L70
            eِٔۙ r13 = r13.f27502e     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "Error querying user properties. appId"
            eٖٓۙ r2 = defpackage.C13879e.m3689e(r4)     // Catch: java.lang.Throwable -> L70
            r13.metrica(r2, r0, r1)     // Catch: java.lang.Throwable -> L70
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L70
        L9c:
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r0
        La2:
            if (r11 == 0) goto La7
            r11.close()
        La7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m507e(java.lang.String):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0221 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ea A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:11:0x004a, B:13:0x0066, B:21:0x006e, B:24:0x0072, B:25:0x00ca, B:27:0x00f0, B:28:0x0102, B:30:0x0106, B:31:0x0116, B:33:0x011c, B:34:0x012c, B:43:0x015a, B:44:0x0162, B:46:0x016d, B:48:0x018d, B:50:0x019b, B:51:0x01a5, B:53:0x01e3, B:62:0x01d3, B:63:0x01ea, B:66:0x0147, B:70:0x01fc, B:72:0x020f, B:75:0x003e, B:79:0x0089, B:81:0x008f, B:84:0x009e, B:87:0x00c2, B:90:0x0094), top: B:2:0x0018 }] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* renamed from: eٕؒ۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m508e(java.lang.String r21, long r22, long r24, defpackage.C9156e r26) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m508e(java.lang.String, long, long, eٍؐؗ):void");
    }

    /* renamed from: eۣؓٗ, reason: contains not printable characters */
    public final boolean m509e(C10030e c10030e) {
        C6936e c6936e = (C6936e) this.f36443e;
        String str = c10030e.vip;
        mo2250e();
        m613e();
        String str2 = c10030e.ad;
        String str3 = c10030e.metrica;
        if (m523e(str2, str3) == null) {
            if (C5240e.m1780e(str3)) {
                if (m520e("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(c6936e.f14221e.m2825e(str2, AbstractC17254e.f33867super), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long m520e = m520e("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                c6936e.getClass();
                if (m520e >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(c10030e.license));
        m502e(contentValues, c10030e.appmetrica);
        try {
            if (m533e().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.vip(C13879e.m3689e(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.metrica(C13879e.m3689e(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    /* renamed from: eؕؑٝ, reason: contains not printable characters */
    public final void m510e() {
        m613e();
        m533e().beginTransaction();
    }

    /* renamed from: eؘؕٗ, reason: contains not printable characters */
    public final long m511e(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = m533e().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                C13879e c13879e = ((C6936e) this.f36443e).f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27502e.metrica(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: eؕ٘ۘ, reason: contains not printable characters */
    public final String m512e(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = m533e().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return BuildConfig.FLAVOR;
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e) {
                C13879e c13879e = ((C6936e) this.f36443e).f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27502e.metrica(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: eؕۚٙ, reason: contains not printable characters */
    public final List m513e(String str, String str2, String str3) {
        AbstractC9528e.purchase(str);
        mo2250e();
        m613e();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m518e(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* renamed from: eؕۡ۠, reason: contains not printable characters */
    public final List m514e(String str) {
        ArrayList arrayList;
        String string;
        C6936e c6936e = (C6936e) this.f36443e;
        mo2250e();
        m613e();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase m533e = m533e();
            m533e.beginTransaction();
            Cursor cursor = null;
            try {
                try {
                    cursor = m533e.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursor.moveToFirst()) {
                        boolean isEmpty = str.isEmpty();
                        do {
                            String string2 = cursor.getString(0);
                            if (cursor.isNull(1)) {
                                string = BuildConfig.FLAVOR;
                            } else {
                                string = cursor.getString(1);
                                AbstractC9528e.startapp(string);
                            }
                            if (string2 == null) {
                                C13879e c13879e = c6936e.f14227e;
                                C6936e.yandex(c13879e);
                                c13879e.f27502e.vip(C13879e.m3689e(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j = cursor.getLong(2);
                                C13430e signatures = C10045e.signatures();
                                signatures.vip();
                                ((C10045e) signatures.f12709e).tapsense(string2);
                                signatures.vip();
                                ((C10045e) signatures.f12709e).isPro(j);
                                signatures.vip();
                                ((C10045e) signatures.f12709e).inmobi(string);
                                if (isEmpty) {
                                    signatures.vip();
                                    ((C10045e) signatures.f12709e).isVip();
                                }
                                arrayList2.add((C10045e) signatures.appmetrica());
                            }
                        } while (cursor.moveToNext());
                        m533e.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        m533e.setTransactionSuccessful();
                        arrayList = arrayList2;
                    } else {
                        m533e.setTransactionSuccessful();
                        arrayList = arrayList2;
                    }
                } catch (SQLiteException e) {
                    C13879e c13879e2 = c6936e.f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27502e.metrica(C13879e.m3689e(str), e, "Error querying or deleting diagnostic signals. appId");
                    arrayList = Collections.EMPTY_LIST;
                }
                if (cursor != null) {
                    cursor.close();
                }
                m533e.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                m533e.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            C13879e c13879e3 = c6936e.f14227e;
            C6936e.yandex(c13879e3);
            c13879e3.f27502e.metrica(C13879e.m3689e(str), e2, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    /* renamed from: eؖؗؖ, reason: contains not printable characters */
    public final C5291e m515e(String str) {
        AbstractC9528e.startapp(str);
        mo2250e();
        m613e();
        return C5291e.metrica(100, m512e("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* renamed from: eٟؖٚ, reason: contains not printable characters */
    public final void m516e(ContentValues contentValues) {
        C6936e c6936e = (C6936e) this.f36443e;
        try {
            SQLiteDatabase m533e = m533e();
            if (contentValues.getAsString("app_id") == null) {
                C13879e c13879e = c6936e.f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27501e.vip(C13879e.m3689e("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (m533e.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && m533e.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                C13879e c13879e2 = c6936e.f14227e;
                C6936e.yandex(c13879e2);
                c13879e2.f27502e.metrica(C13879e.m3689e("consent_settings"), C13879e.m3689e("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            C13879e c13879e3 = c6936e.f14227e;
            C6936e.yandex(c13879e3);
            c13879e3.f27502e.license("Error storing into table. key", C13879e.m3689e("consent_settings"), C13879e.m3689e("app_id"), e);
        }
    }

    /* renamed from: eًؗٛ, reason: contains not printable characters */
    public final String m517e() {
        ((C6936e) this.f36443e).f14215e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) AbstractC17254e.f33795case.ad(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l + ")";
        String m1750native = AbstractC5087e.m1750native(((Long) AbstractC17254e.f33854implements.ad(null)).longValue(), ")", AbstractC1786e.inmobi(currentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "));
        StringBuilder sb = new StringBuilder(AbstractC8703e.crashlytics(str.length(), 5, m1750native.length(), 1));
        AbstractC13501e.Signature(sb, "(", str, " OR ", m1750native);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        r20 = r12.getString(5);
        r22 = r12.getLong(6);
        r3 = r28.f19060e.f30383e;
        defpackage.C15398e.m3939break(r3);
        r4 = r12.getBlob(7);
        r5 = defpackage.C15541e.CREATOR;
        r21 = (defpackage.C15541e) r3.m2902e(r4, r5);
        r17 = r12.getLong(8);
        defpackage.C15398e.m3939break(r3);
        r24 = (defpackage.C15541e) r3.m2902e(r12.getBlob(9), r5);
        r6 = r12.getLong(10);
        r25 = r12.getLong(11);
        defpackage.C15398e.m3939break(r3);
        r0.add(new defpackage.C15148e(r14, r15, new defpackage.C9097e(r6, r8, r9, r15), r17, r19, r20, r21, r22, r24, r25, (defpackage.C15541e) r3.m2902e(r12.getBlob(12), r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f9, code lost:
    
        if (r12.moveToNext() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r3 = r2.f14227e;
        defpackage.C6936e.yandex(r3);
        r3.f27502e.vip(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x004c, code lost:
    
        if (r12.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        if (r0.size() < 1000) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006e, code lost:
    
        r14 = r12.getString(0);
        r15 = r12.getString(1);
        r9 = r12.getString(2);
        r8 = m540e(r12, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0087, code lost:
    
        if (r12.getInt(4) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0089, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* renamed from: eؗۗؓ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m518e(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m518e(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final boolean m519e(String str) {
        EnumC14201e[] enumC14201eArr = {EnumC14201e.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC14201eArr[0].f28063e));
        String m503e = m503e(arrayList);
        String m517e = m517e();
        return m520e(AbstractC4653e.ads(new StringBuilder((m503e.length() + 61) + m517e.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", m503e, " AND NOT ", m517e), new String[]{str}) != 0;
    }

    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public final long m520e(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m533e().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            } catch (SQLiteException e) {
                C13879e c13879e = ((C6936e) this.f36443e).f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27502e.metrica(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, eُؕٔ] */
    /* renamed from: eؗۢؗ, reason: contains not printable characters */
    public final C3363e m521e(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C6936e c6936e = (C6936e) this.f36443e;
        AbstractC9528e.purchase(str);
        mo2250e();
        m613e();
        String[] strArr = {str};
        ?? obj = new Object();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase m533e = m533e();
                cursor = m533e.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j) {
                        obj.vip = cursor.getLong(1);
                        obj.ad = cursor.getLong(2);
                        obj.metrica = cursor.getLong(3);
                        obj.license = cursor.getLong(4);
                        obj.appmetrica = cursor.getLong(5);
                        obj.purchase = cursor.getLong(6);
                        obj.billing = cursor.getLong(7);
                    }
                    if (z) {
                        obj.vip += j2;
                    }
                    if (z2) {
                        obj.ad += j2;
                    }
                    if (z3) {
                        obj.metrica += j2;
                    }
                    if (z4) {
                        obj.license += j2;
                    }
                    if (z5) {
                        obj.appmetrica += j2;
                    }
                    if (z6) {
                        obj.purchase += j2;
                    }
                    if (z7) {
                        obj.billing += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(obj.ad));
                    contentValues.put("daily_events_count", Long.valueOf(obj.vip));
                    contentValues.put("daily_conversions_count", Long.valueOf(obj.metrica));
                    contentValues.put("daily_error_events_count", Long.valueOf(obj.license));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(obj.appmetrica));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(obj.purchase));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(obj.billing));
                    m533e.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    C13879e c13879e = c6936e.f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27495e.vip(C13879e.m3689e(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                C13879e c13879e2 = c6936e.f14227e;
                C6936e.yandex(c13879e2);
                c13879e2.f27502e.metrica(C13879e.m3689e(str), e, "Error updating daily counts. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
            return obj;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public final boolean m522e(String str, String str2) {
        return m520e("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /* renamed from: eٍؘٖ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C10030e m523e(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f36443e
            r1 = r0
            eؚؖٞ r1 = (defpackage.C6936e) r1
            defpackage.AbstractC9528e.purchase(r12)
            defpackage.AbstractC9528e.purchase(r13)
            r11.mo2250e()
            r11.m613e()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.m533e()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r4 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r6 = "app_id=? and name=?"
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L37
            goto L95
        L37:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r10 = r11.m540e(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            eَؕؔ r4 = new eَؕؔ     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r12 == 0) goto L6d
            eٍؙٓ r12 = r1.f14227e     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            defpackage.C6936e.yandex(r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            eِٔۙ r12 = r12.f27502e     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r13 = "Got multiple records for user property, expected one. appId"
            eٖٓۙ r0 = defpackage.C13879e.m3689e(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r12.vip(r0, r13)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L67:
            r0 = move-exception
            r12 = r0
            goto L75
        L6a:
            r0 = move-exception
        L6b:
            r12 = r0
            goto L7f
        L6d:
            r3.close()
            return r4
        L71:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L6b
        L75:
            r2 = r3
            goto L9b
        L77:
            r0 = move-exception
            r12 = r0
            goto L9b
        L7a:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r12 = r0
            r3 = r2
        L7f:
            eٍؙٓ r13 = r1.f14227e     // Catch: java.lang.Throwable -> L67
            defpackage.C6936e.yandex(r13)     // Catch: java.lang.Throwable -> L67
            eِٔۙ r13 = r13.f27502e     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Error querying user property. appId"
            eٖٓۙ r4 = defpackage.C13879e.m3689e(r5)     // Catch: java.lang.Throwable -> L67
            eؚٟٚ r1 = r1.f14202e     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.metrica(r7)     // Catch: java.lang.Throwable -> L67
            r13.license(r0, r4, r1, r12)     // Catch: java.lang.Throwable -> L67
        L95:
            if (r3 == 0) goto L9a
            r3.close()
        L9a:
            return r2
        L9b:
            if (r2 == 0) goto La0
            r2.close()
        La0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m523e(java.lang.String, java.lang.String):eَؕؔ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m524e() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m533e()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L37
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3d
        L22:
            r0 = move-exception
            goto L3d
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            java.lang.Object r3 = r6.f36443e     // Catch: java.lang.Throwable -> L1a
            eؚؖٞ r3 = (defpackage.C6936e) r3     // Catch: java.lang.Throwable -> L1a
            eٍؙٓ r3 = r3.f14227e     // Catch: java.lang.Throwable -> L1a
            defpackage.C6936e.yandex(r3)     // Catch: java.lang.Throwable -> L1a
            eِٔۙ r3 = r3.f27502e     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.vip(r2, r4)     // Catch: java.lang.Throwable -> L1a
        L37:
            if (r0 == 0) goto L3c
            r0.close()
        L3c:
            return r1
        L3d:
            if (r1 == 0) goto L42
            r1.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m524e():java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:2|3|4)|(2:6|(3:8|9|10)(1:13))|14|15|(1:17)(2:20|21)|18|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r0 = r0.f14227e;
        defpackage.C6936e.yandex(r0);
        r0.f27502e.license("Error inserting column. appId", defpackage.C13879e.m3689e(r14), "first_open_count", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        r7 = r4;
     */
    /* renamed from: eًؕ۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m525e(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f36443e
            eؚؖٞ r0 = (defpackage.C6936e) r0
            java.lang.String r1 = "select first_open_count from app2 where app_id=?"
            defpackage.AbstractC9528e.purchase(r14)
            java.lang.String r2 = "first_open_count"
            defpackage.AbstractC9528e.purchase(r2)
            r13.mo2250e()
            r13.m613e()
            android.database.sqlite.SQLiteDatabase r3 = r13.m533e()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = -1
            long r9 = r13.m511e(r1, r6, r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r6 = "app2"
            java.lang.String r11 = "app_id"
            if (r1 != 0) goto L72
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r10 = "previous_install_count"
            r1.put(r10, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            r10 = 5
            long r9 = r3.insertWithOnConflict(r6, r9, r1, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L71
            eٍؙٓ r1 = r0.f14227e     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            defpackage.C6936e.yandex(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            eِٔۙ r1 = r1.f27502e     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = "Failed to insert column (got -1). appId"
            eٖٓۙ r9 = defpackage.C13879e.m3689e(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.metrica(r9, r2, r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            goto Lbd
        L6d:
            r14 = move-exception
            goto Lc1
        L6f:
            r1 = move-exception
            goto Lac
        L71:
            r9 = r4
        L72:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11 = 1
            long r11 = r11 + r9
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r2, r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r11 = "app_id = ?"
            java.lang.String[] r12 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = r3.update(r6, r1, r11, r12)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            long r11 = (long) r1     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto La6
            eٍؙٓ r1 = r0.f14227e     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            defpackage.C6936e.yandex(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            eِٔۙ r1 = r1.f27502e     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r4 = "Failed to update column (got 0). appId"
            eٖٓۙ r5 = defpackage.C13879e.m3689e(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.metrica(r5, r2, r4)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            goto Lbd
        La4:
            r1 = move-exception
            goto Lab
        La6:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r7 = r9
            goto Lbd
        Lab:
            r4 = r9
        Lac:
            eٍؙٓ r0 = r0.f14227e     // Catch: java.lang.Throwable -> L6d
            defpackage.C6936e.yandex(r0)     // Catch: java.lang.Throwable -> L6d
            eِٔۙ r0 = r0.f27502e     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "Error inserting column. appId"
            eٖٓۙ r14 = defpackage.C13879e.m3689e(r14)     // Catch: java.lang.Throwable -> L6d
            r0.license(r6, r14, r2, r1)     // Catch: java.lang.Throwable -> L6d
            r7 = r4
        Lbd:
            r3.endTransaction()
            return r7
        Lc1:
            r3.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m525e(java.lang.String):long");
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final void m526e(Long l) {
        C6936e c6936e = (C6936e) this.f36443e;
        mo2250e();
        m613e();
        try {
            if (m533e().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                C13879e c13879e = c6936e.f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27495e.ad("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.vip(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    /* renamed from: eًٖٕ, reason: contains not printable characters */
    public final void m527e(String str, C2497e c2497e) {
        C6936e c6936e = (C6936e) this.f36443e;
        AbstractC9528e.startapp(c2497e);
        mo2250e();
        m613e();
        ContentValues contentValues = new ContentValues();
        String str2 = c2497e.ad;
        contentValues.put("app_id", str2);
        contentValues.put("name", c2497e.vip);
        contentValues.put("lifetime_count", Long.valueOf(c2497e.metrica));
        contentValues.put("current_bundle_count", Long.valueOf(c2497e.license));
        contentValues.put("last_fire_timestamp", Long.valueOf(c2497e.purchase));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c2497e.billing));
        contentValues.put("last_bundled_day", c2497e.yandex);
        contentValues.put("last_sampled_complex_event_id", c2497e.startapp);
        contentValues.put("last_sampling_rate", c2497e.adcel);
        contentValues.put("current_session_count", Long.valueOf(c2497e.appmetrica));
        Boolean bool = c2497e.mopub;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m533e().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                C13879e c13879e = c6936e.f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27502e.vip(C13879e.m3689e(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.metrica(C13879e.m3689e(str2), e, "Error storing event aggregates. appId");
        }
    }

    /* renamed from: eًؙٞ, reason: contains not printable characters */
    public final void m528e(C2709e c2709e, boolean z) {
        mo2250e();
        m613e();
        AbstractC9528e.purchase(c2709e.signatures());
        AbstractC9528e.advert(c2709e.m1145e());
        m541e();
        C6936e c6936e = (C6936e) this.f36443e;
        C17647e c17647e = c6936e.f14215e;
        C13879e c13879e = c6936e.f14227e;
        c17647e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long m1076e = c2709e.m1076e();
        C6973e c6973e = AbstractC17254e.f33854implements;
        if (m1076e < currentTimeMillis - ((Long) c6973e.ad(null)).longValue() || c2709e.m1076e() > ((Long) c6973e.ad(null)).longValue() + currentTimeMillis) {
            C6936e.yandex(c13879e);
            c13879e.f27495e.license("Storing bundle outside of the max uploading time span. appId, now, timestamp", C13879e.m3689e(c2709e.signatures()), Long.valueOf(currentTimeMillis), Long.valueOf(c2709e.m1076e()));
        }
        byte[] ad = c2709e.ad();
        try {
            C10686e c10686e = this.f19060e.f30383e;
            C15398e.m3939break(c10686e);
            byte[] m2901e = c10686e.m2901e(ad);
            C6936e.yandex(c13879e);
            c13879e.f27497e.vip(Integer.valueOf(m2901e.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c2709e.signatures());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c2709e.m1076e()));
            contentValues.put("data", m2901e);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c2709e.m1063e()) {
                contentValues.put("retry_count", Integer.valueOf(c2709e.m1080e()));
            }
            try {
                if (m533e().insert("queue", null, contentValues) == -1) {
                    C6936e.yandex(c13879e);
                    c13879e.f27502e.vip(C13879e.m3689e(c2709e.signatures()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                C6936e.yandex(c13879e);
                c13879e.f27502e.metrica(C13879e.m3689e(c2709e.signatures()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            C6936e.yandex(c13879e);
            c13879e.f27502e.metrica(C13879e.m3689e(c2709e.signatures()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    /* renamed from: eً۟ۘ, reason: contains not printable characters */
    public final boolean m529e(C15148e c15148e) {
        C6936e c6936e = (C6936e) this.f36443e;
        mo2250e();
        m613e();
        String str = c15148e.f29987e;
        AbstractC9528e.startapp(str);
        if (m523e(str, c15148e.f29980e.f18221e) == null) {
            long m520e = m520e("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            c6936e.getClass();
            if (m520e >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c15148e.f29982e);
        contentValues.put("name", c15148e.f29980e.f18221e);
        Object billing = c15148e.f29980e.billing();
        AbstractC9528e.startapp(billing);
        m502e(contentValues, billing);
        contentValues.put("active", Boolean.valueOf(c15148e.f29979e));
        contentValues.put("trigger_event_name", c15148e.f29989e);
        contentValues.put("trigger_timeout", Long.valueOf(c15148e.f29983e));
        C15541e c15541e = c15148e.f29988e;
        C5240e c5240e = c6936e.f14223e;
        C13879e c13879e = c6936e.f14227e;
        C6936e.purchase(c5240e);
        contentValues.put("timed_out_event", C5240e.m1776e(c15541e));
        contentValues.put("creation_timestamp", Long.valueOf(c15148e.f29985e));
        C6936e.purchase(c5240e);
        contentValues.put("triggered_event", C5240e.m1776e(c15148e.f29986e));
        contentValues.put("triggered_timestamp", Long.valueOf(c15148e.f29980e.f18220e));
        contentValues.put("time_to_live", Long.valueOf(c15148e.f29981e));
        contentValues.put("expired_event", C5240e.m1776e(c15148e.f29984e));
        try {
            if (m533e().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            C6936e.yandex(c13879e);
            c13879e.f27502e.vip(C13879e.m3689e(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            C6936e.yandex(c13879e);
            c13879e.f27502e.metrica(C13879e.m3689e(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* renamed from: eٌُۚ, reason: contains not printable characters */
    public final void m530e(String str, C5291e c5291e) {
        AbstractC9528e.startapp(str);
        AbstractC9528e.startapp(c5291e);
        mo2250e();
        m613e();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c5291e.billing());
        contentValues.put("consent_source", Integer.valueOf(c5291e.vip));
        m516e(contentValues);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:27:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /* renamed from: eٌۜۧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C0912e m531e(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f36443e
            r1 = r0
            eؚؖٞ r1 = (defpackage.C6936e) r1
            defpackage.AbstractC9528e.purchase(r12)
            r11.mo2250e()
            r11.m613e()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.m533e()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L33
            goto L83
        L33:
            r0 = 0
            byte[] r0 = r3.getBlob(r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r4 = 1
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r5 = 2
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r6 == 0) goto L5e
            eٍؙٓ r6 = r1.f14227e     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            defpackage.C6936e.yandex(r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            eِٔۙ r6 = r6.f27502e     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            eٖٓۙ r8 = defpackage.C13879e.m3689e(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.vip(r8, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L6c
        L5c:
            r0 = move-exception
            goto L73
        L5e:
            if (r0 != 0) goto L61
            goto L83
        L61:
            eؚؒٗ r6 = new eؚؒٗ     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r7 = 13
            r6.<init>(r7, r0, r4, r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r3.close()
            return r6
        L6c:
            r2 = r3
            goto L89
        L6e:
            r0 = move-exception
            r12 = r0
            goto L89
        L71:
            r0 = move-exception
            r3 = r2
        L73:
            eٍؙٓ r1 = r1.f14227e     // Catch: java.lang.Throwable -> L59
            defpackage.C6936e.yandex(r1)     // Catch: java.lang.Throwable -> L59
            eِٔۙ r1 = r1.f27502e     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "Error querying remote config. appId"
            eٖٓۙ r12 = defpackage.C13879e.m3689e(r12)     // Catch: java.lang.Throwable -> L59
            r1.metrica(r12, r0, r4)     // Catch: java.lang.Throwable -> L59
        L83:
            if (r3 == 0) goto L88
            r3.close()
        L88:
            return r2
        L89:
            if (r2 == 0) goto L8e
            r2.close()
        L8e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m531e(java.lang.String):eؚؒٗ");
    }

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public final void m532e(String str, C6471e c6471e) {
        mo2250e();
        m613e();
        AbstractC9528e.purchase(str);
        C6936e c6936e = (C6936e) this.f36443e;
        C17647e c17647e = c6936e.f14215e;
        C13879e c13879e = c6936e.f14227e;
        c17647e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C6973e c6973e = AbstractC17254e.f33811e;
        long longValue = currentTimeMillis - ((Long) c6973e.ad(null)).longValue();
        long j = c6471e.f13386e;
        if (j < longValue || j > ((Long) c6973e.ad(null)).longValue() + currentTimeMillis) {
            C6936e.yandex(c13879e);
            c13879e.f27495e.license("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C13879e.m3689e(str), Long.valueOf(currentTimeMillis), Long.valueOf(j));
        }
        C6936e.yandex(c13879e);
        c13879e.f27497e.ad("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c6471e.f13387e);
        contentValues.put("source", Integer.valueOf(c6471e.f13385e));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (m533e().insert("trigger_uris", null, contentValues) == -1) {
                C6936e.yandex(c13879e);
                c13879e.f27502e.vip(C13879e.m3689e(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            C6936e.yandex(c13879e);
            c13879e.f27502e.metrica(C13879e.m3689e(str), e, "Error storing trigger URI. appId");
        }
    }

    /* renamed from: eٍٟۨ, reason: contains not printable characters */
    public final SQLiteDatabase m533e() {
        mo2250e();
        try {
            return this.f3946e.getWritableDatabase();
        } catch (SQLiteException e) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.vip(e, "Error opening database");
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r2.moveToNext() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r2.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r1 = r2.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        r1 = m544e("events", r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        m527e("events_snapshot", r1);
     */
    /* renamed from: eَۡٙ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m534e(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "events_snapshot"
            r12.m538e(r0, r13)
            java.lang.String r1 = "name"
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.m533e()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            java.lang.String r4 = "events"
            r11 = 0
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            java.lang.Object[] r1 = r1.toArray(r5)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            r5 = r1
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 == 0) goto L61
        L2f:
            java.lang.String r1 = r2.getString(r11)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 == 0) goto L46
            java.lang.String r3 = "events"
            eُؚؔ r1 = r12.m544e(r3, r13, r1)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 == 0) goto L46
            r12.m527e(r0, r1)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            goto L46
        L41:
            r0 = move-exception
            r13 = r0
            goto L67
        L44:
            r0 = move-exception
            goto L4d
        L46:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 != 0) goto L2f
            goto L61
        L4d:
            java.lang.Object r1 = r12.f36443e     // Catch: java.lang.Throwable -> L41
            eؚؖٞ r1 = (defpackage.C6936e) r1     // Catch: java.lang.Throwable -> L41
            eٍؙٓ r1 = r1.f14227e     // Catch: java.lang.Throwable -> L41
            defpackage.C6936e.yandex(r1)     // Catch: java.lang.Throwable -> L41
            eِٔۙ r1 = r1.f27502e     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "Error creating snapshot. appId"
            eٖٓۙ r13 = defpackage.C13879e.m3689e(r13)     // Catch: java.lang.Throwable -> L41
            r1.metrica(r13, r0, r3)     // Catch: java.lang.Throwable -> L41
        L61:
            if (r2 == 0) goto L66
            r2.close()
        L66:
            return
        L67:
            if (r2 == 0) goto L6c
            r2.close()
        L6c:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m534e(java.lang.String):void");
    }

    /* renamed from: eُۨٞ, reason: contains not printable characters */
    public final void m535e(String str, C5291e c5291e) {
        AbstractC9528e.startapp(str);
        mo2250e();
        m613e();
        m530e(str, m542e(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c5291e.billing());
        m516e(contentValues);
    }

    /* renamed from: eِؔۛ, reason: contains not printable characters */
    public final C3363e m536e(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return m521e(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    /* renamed from: eِّٞ, reason: contains not printable characters */
    public final void m537e() {
        m613e();
        m533e().setTransactionSuccessful();
    }

    /* renamed from: eِۘٞ, reason: contains not printable characters */
    public final void m538e(String str, String str2) {
        AbstractC9528e.purchase(str2);
        mo2250e();
        m613e();
        try {
            m533e().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.metrica(C13879e.m3689e(str2), e, "Error deleting snapshot. appId");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        defpackage.C6936e.yandex(r13);
        r13.f27502e.vip(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* renamed from: eِۜۙ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m539e(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m539e(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public final Object m540e(Cursor cursor, int i) {
        C6936e c6936e = (C6936e) this.f36443e;
        int type = cursor.getType(i);
        if (type == 0) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.vip(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        C13879e c13879e3 = c6936e.f14227e;
        C6936e.yandex(c13879e3);
        c13879e3.f27502e.ad("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public final void m541e() {
        mo2250e();
        m613e();
        if (m506e()) {
            C15398e c15398e = this.f19060e;
            long metrica = c15398e.f30379e.f29370e.metrica();
            C6936e c6936e = (C6936e) this.f36443e;
            c6936e.f14215e.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - metrica) > ((Long) AbstractC17254e.f33874try.ad(null)).longValue()) {
                c15398e.f30379e.f29370e.license(elapsedRealtime);
                mo2250e();
                m613e();
                if (m506e()) {
                    SQLiteDatabase m533e = m533e();
                    c6936e.f14215e.getClass();
                    int delete = m533e.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) AbstractC17254e.f33854implements.ad(null)).longValue())});
                    if (delete > 0) {
                        C13879e c13879e = c6936e.f14227e;
                        C6936e.yandex(c13879e);
                        c13879e.f27497e.vip(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /* renamed from: eّؑ۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C5291e m542e(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f36443e
            eؚؖٞ r0 = (defpackage.C6936e) r0
            defpackage.AbstractC9528e.startapp(r5)
            r4.mo2250e()
            r4.m613e()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.m533e()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r1 != 0) goto L36
            eٍؙٓ r1 = r0.f14227e     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            defpackage.C6936e.yandex(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            eِٔۙ r1 = r1.f27497e     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            java.lang.String r3 = "No data found"
            r1.ad(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
        L2e:
            r5.close()
            goto L5c
        L32:
            r0 = move-exception
            goto L45
        L34:
            r1 = move-exception
            goto L4d
        L36:
            r1 = 0
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            r3 = 1
            int r3 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            eؗۦۢ r2 = defpackage.C5291e.metrica(r3, r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            goto L2e
        L45:
            r2 = r5
            goto L62
        L47:
            r5 = move-exception
            r0 = r5
            goto L62
        L4a:
            r5 = move-exception
            r1 = r5
            r5 = r2
        L4d:
            eٍؙٓ r0 = r0.f14227e     // Catch: java.lang.Throwable -> L32
            defpackage.C6936e.yandex(r0)     // Catch: java.lang.Throwable -> L32
            eِٔۙ r0 = r0.f27502e     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "Error querying database."
            r0.vip(r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            eؗۦۢ r5 = defpackage.C5291e.metrica
            return r5
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m542e(java.lang.String):eؗۦۢ");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a4 A[Catch: SQLiteException -> 0x02c0, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02c0, blocks: (B:78:0x0289, B:80:0x02a4), top: B:77:0x0289 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01db  */
    /* renamed from: eّْؗ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m543e(java.lang.String r27, java.lang.Long r28, java.lang.String r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m543e(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0127  */
    /* renamed from: eؘؙْ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C2497e m544e(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m544e(java.lang.String, java.lang.String, java.lang.String):eُؚؔ");
    }

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public final void m545e(ArrayList arrayList) {
        C6936e c6936e = (C6936e) this.f36443e;
        mo2250e();
        m613e();
        AbstractC9528e.startapp(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (m506e()) {
            String join = TextUtils.join(",", arrayList);
            String ads = AbstractC8647e.ads(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (m520e(AbstractC8647e.ads(new StringBuilder(ads.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", ads, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                C13879e c13879e = c6936e.f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27495e.ad("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase m533e = m533e();
                StringBuilder sb = new StringBuilder(ads.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(ads);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                m533e.execSQL(sb.toString());
            } catch (SQLiteException e) {
                C13879e c13879e2 = c6936e.f14227e;
                C6936e.yandex(c13879e2);
                c13879e2.f27502e.vip(e, "Error incrementing retry count. error");
            }
        }
    }

    /* renamed from: eُٓٞ, reason: contains not printable characters */
    public final C2497e m546e(String str, C2266e c2266e, String str2) {
        C2497e m544e = m544e("events", str, c2266e.applovin());
        if (m544e != null) {
            long j = m544e.appmetrica + 1;
            long j2 = m544e.license + 1;
            return new C2497e(m544e.ad, m544e.vip, m544e.metrica + 1, j2, j, m544e.purchase, m544e.billing, m544e.yandex, m544e.startapp, m544e.adcel, m544e.mopub);
        }
        C6936e c6936e = (C6936e) this.f36443e;
        C13879e c13879e = c6936e.f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27495e.metrica(C13879e.m3689e(str), c6936e.f14202e.ad(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new C2497e(str, c2266e.applovin(), 1L, 1L, 1L, c2266e.premium(), 0L, null, null, null, null);
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:37:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0116  */
    /* renamed from: eٓۗٞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C15148e m547e(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m547e(java.lang.String, java.lang.String):eٕؐٔ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        m527e("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* renamed from: eؙٓۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m548e(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m548e(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0402  */
    /* renamed from: eٓۦْ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C0956e m549e(java.lang.String r54) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1248e.m549e(java.lang.String):eٍِؒ");
    }

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public final void m550e(String str, Long l, long j, C2266e c2266e) {
        mo2250e();
        m613e();
        AbstractC9528e.startapp(c2266e);
        AbstractC9528e.purchase(str);
        C6936e c6936e = (C6936e) this.f36443e;
        byte[] ad = c2266e.ad();
        C13879e c13879e = c6936e.f14227e;
        C13879e c13879e2 = c6936e.f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27497e.metrica(c6936e.f14202e.ad(str), Integer.valueOf(ad.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", ad);
        try {
            if (m533e().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                C6936e.yandex(c13879e2);
                c13879e2.f27502e.vip(C13879e.m3689e(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.metrica(C13879e.m3689e(str), e, "Error storing complex main event. appId");
        }
    }

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public final void m551e(List list) {
        AbstractC9528e.startapp(list);
        mo2250e();
        m613e();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int delete = m533e().delete("raw_events", sb.toString(), null);
        if (delete != list.size()) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.metrica(Integer.valueOf(delete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final void m552e(long j) {
        mo2250e();
        m613e();
        try {
            if (m533e().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.vip(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final long m553e(String str, C3179e c3179e, String str2, Map map, EnumC14201e enumC14201e, Long l) {
        int delete;
        C6936e c6936e = (C6936e) this.f36443e;
        mo2250e();
        m613e();
        AbstractC9528e.startapp(c3179e);
        AbstractC9528e.purchase(str);
        mo2250e();
        m613e();
        if (m506e()) {
            C15398e c15398e = this.f19060e;
            long metrica = c15398e.f30379e.f29369e.metrica();
            C17647e c17647e = c6936e.f14215e;
            C13879e c13879e = c6936e.f14227e;
            c17647e.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - metrica) > ((Long) AbstractC17254e.f33874try.ad(null)).longValue()) {
                c15398e.f30379e.f29369e.license(elapsedRealtime);
                mo2250e();
                m613e();
                if (m506e() && (delete = m533e().delete("upload_queue", m517e(), new String[0])) > 0) {
                    C6936e.yandex(c13879e);
                    c13879e.f27497e.vip(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                AbstractC9528e.purchase(str);
                mo2250e();
                m613e();
                try {
                    int m2825e = c6936e.f14221e.m2825e(str, AbstractC17254e.ads);
                    if (m2825e > 0) {
                        m533e().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(m2825e)});
                    }
                } catch (SQLiteException e) {
                    C6936e.yandex(c13879e);
                    c13879e.f27502e.metrica(C13879e.m3689e(str), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] ad = c3179e.ad();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", ad);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(enumC14201e.f28063e));
        C17647e c17647e2 = c6936e.f14215e;
        C13879e c13879e2 = c6936e.f14227e;
        c17647e2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long insert = m533e().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.vip(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.metrica(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    @Override // defpackage.AbstractC1487e
    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final void mo554e() {
        C6936e c6936e = (C6936e) this.f36443e;
        if (c6936e.f14221e.m2822e(null, AbstractC17254e.f33810e)) {
            C6915e c6915e = c6936e.f14226e;
            C6936e.yandex(c6915e);
            c6915e.m2254e(new RunnableC16721e(9, this));
        }
    }

    /* renamed from: eٗ۟ٓ, reason: contains not printable characters */
    public final C14153e m555e(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        EnumC14201e enumC14201e;
        C6936e c6936e = (C6936e) this.f36443e;
        if (TextUtils.isEmpty(str2)) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27496e.ad("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            C16393e c16393e = (C16393e) C10686e.m2868e(C3179e.premium(), bArr);
            EnumC14201e[] values = EnumC14201e.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    enumC14201e = EnumC14201e.UNKNOWN;
                    break;
                }
                enumC14201e = values[i3];
                if (enumC14201e.f28063e == i) {
                    break;
                }
                i3++;
            }
            if (enumC14201e != EnumC14201e.GOOGLE_SIGNAL && enumC14201e != EnumC14201e.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = DesugarCollections.unmodifiableList(((C3179e) c16393e.f12709e).signatures()).iterator();
                while (it.hasNext()) {
                    C17491e c17491e = (C17491e) ((C2709e) it.next()).advert();
                    c17491e.vip();
                    ((C2709e) c17491e.f12709e).m1154e(i2);
                    arrayList.add((C2709e) c17491e.appmetrica());
                }
                c16393e.vip();
                ((C3179e) c16393e.f12709e).m1292interface();
                c16393e.vip();
                ((C3179e) c16393e.f12709e).m1290class(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    String str4 = split[i4];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        C13879e c13879e2 = c6936e.f14227e;
                        C6936e.yandex(c13879e2);
                        c13879e2.f27502e.vip(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i4++;
                }
            }
            return new C14153e(j, (C3179e) c16393e.appmetrica(), str2, hashMap, enumC14201e, j2, j3, j4, i2);
        } catch (IOException e) {
            C13879e c13879e3 = c6936e.f14227e;
            C6936e.yandex(c13879e3);
            c13879e3.f27502e.metrica(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    /* renamed from: e٘ؔؖ, reason: contains not printable characters */
    public final void m556e(String str, String str2) {
        AbstractC9528e.purchase(str);
        AbstractC9528e.purchase(str2);
        mo2250e();
        m613e();
        try {
            m533e().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            C6936e c6936e = (C6936e) this.f36443e;
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.license("Error deleting conditional property", C13879e.m3689e(str), c6936e.f14202e.metrica(str2), e);
        }
    }

    /* renamed from: eِ٘, reason: contains not printable characters */
    public final void m557e() {
        m613e();
        m533e().endTransaction();
    }

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public final void m558e(Long l) {
        C6936e c6936e = (C6936e) this.f36443e;
        mo2250e();
        m613e();
        if (m506e()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m520e(sb.toString(), null) > 0) {
                C13879e c13879e = c6936e.f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27495e.ad("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase m533e = m533e();
                c6936e.f14215e.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(currentTimeMillis);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder(sb3.length() + 34 + l.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(sb3);
                sb4.append(" WHERE rowid = ");
                sb4.append(l);
                sb4.append(" AND retry_count < 2147483647");
                m533e.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                C13879e c13879e2 = c6936e.f14227e;
                C6936e.yandex(c13879e2);
                c13879e2.f27502e.vip(e, "Error incrementing retry count. error");
            }
        }
    }

    /* renamed from: e۠ۢ, reason: contains not printable characters */
    public final void m559e(C0956e c0956e, boolean z) {
        C6936e c6936e = (C6936e) this.f36443e;
        C6936e c6936e2 = c0956e.ad;
        mo2250e();
        m613e();
        String firebase = c0956e.firebase();
        AbstractC9528e.startapp(firebase);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", firebase);
        EnumC9102e enumC9102e = EnumC9102e.ANALYTICS_STORAGE;
        C15398e c15398e = this.f19060e;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (c15398e.ad(firebase).startapp(enumC9102e)) {
            contentValues.put("app_instance_id", c0956e.m435class());
        }
        contentValues.put("gmp_app_id", c0956e.m438goto());
        if (c15398e.ad(firebase).startapp(EnumC9102e.AD_STORAGE)) {
            C6915e c6915e = c6936e2.f14226e;
            C6936e.yandex(c6915e);
            c6915e.mo2250e();
            contentValues.put("resettable_device_id_hash", c0956e.appmetrica);
        }
        C6915e c6915e2 = c6936e2.f14226e;
        C6936e.yandex(c6915e2);
        c6915e2.mo2250e();
        contentValues.put("last_bundle_index", Long.valueOf(c0956e.billing));
        C6915e c6915e3 = c6936e2.f14226e;
        C6936e.yandex(c6915e3);
        c6915e3.mo2250e();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c0956e.yandex));
        C6915e c6915e4 = c6936e2.f14226e;
        C6936e.yandex(c6915e4);
        c6915e4.mo2250e();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c0956e.startapp));
        contentValues.put("app_version", c0956e.m442protected());
        C6915e c6915e5 = c6936e2.f14226e;
        C6936e.yandex(c6915e5);
        c6915e5.mo2250e();
        contentValues.put("app_store", c0956e.advert);
        C6915e c6915e6 = c6936e2.f14226e;
        C6936e.yandex(c6915e6);
        c6915e6.mo2250e();
        contentValues.put("gmp_version", Long.valueOf(c0956e.smaato));
        C6915e c6915e7 = c6936e2.f14226e;
        C6936e.yandex(c6915e7);
        c6915e7.mo2250e();
        contentValues.put("dev_cert_hash", Long.valueOf(c0956e.amazon));
        C6915e c6915e8 = c6936e2.f14226e;
        C6936e.yandex(c6915e8);
        c6915e8.mo2250e();
        contentValues.put("measurement_enabled", Boolean.valueOf(c0956e.loadAd));
        C6915e c6915e9 = c6936e2.f14226e;
        C6915e c6915e10 = c6936e2.f14226e;
        C6936e.yandex(c6915e9);
        c6915e9.mo2250e();
        contentValues.put("day", Long.valueOf(c0956e.f3385extends));
        C6936e.yandex(c6915e10);
        c6915e10.mo2250e();
        contentValues.put("daily_public_events_count", Long.valueOf(c0956e.f3392throw));
        C6936e.yandex(c6915e10);
        c6915e10.mo2250e();
        contentValues.put("daily_events_count", Long.valueOf(c0956e.f3394while));
        C6936e.yandex(c6915e10);
        c6915e10.mo2250e();
        contentValues.put("daily_conversions_count", Long.valueOf(c0956e.f3393try));
        C6915e c6915e11 = c6936e2.f14226e;
        C6936e.yandex(c6915e11);
        c6915e11.mo2250e();
        contentValues.put("config_fetched_time", Long.valueOf(c0956e.f3387implements));
        C6915e c6915e12 = c6936e2.f14226e;
        C6936e.yandex(c6915e12);
        c6915e12.mo2250e();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c0956e.f3382case));
        contentValues.put("app_version_int", Long.valueOf(c0956e.m432abstract()));
        contentValues.put("firebase_instance_id", c0956e.m437extends());
        C6936e.yandex(c6915e10);
        c6915e10.mo2250e();
        contentValues.put("daily_error_events_count", Long.valueOf(c0956e.f3390protected));
        C6936e.yandex(c6915e10);
        c6915e10.mo2250e();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c0956e.f3381break));
        C6936e.yandex(c6915e10);
        c6915e10.mo2250e();
        contentValues.put("health_monitor_sample", c0956e.f3380abstract);
        contentValues.put("android_id", (Long) 0L);
        C6915e c6915e13 = c6936e2.f14226e;
        C6936e.yandex(c6915e13);
        c6915e13.mo2250e();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c0956e.Signature));
        contentValues.put("dynamite_version", Long.valueOf(c0956e.vip()));
        if (c15398e.ad(firebase).startapp(enumC9102e)) {
            C6915e c6915e14 = c6936e2.f14226e;
            C6936e.yandex(c6915e14);
            c6915e14.mo2250e();
            contentValues.put("session_stitching_token", c0956e.pro);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c0956e.applovin()));
        C6915e c6915e15 = c6936e2.f14226e;
        C6936e.yandex(c6915e15);
        c6915e15.mo2250e();
        contentValues.put("target_os_version", Long.valueOf(c0956e.tapsense));
        C6915e c6915e16 = c6936e2.f14226e;
        C6936e.yandex(c6915e16);
        c6915e16.mo2250e();
        contentValues.put("session_stitching_token_hash", Long.valueOf(c0956e.isVip));
        C4261e.ad();
        C10476e c10476e = c6936e.f14221e;
        C13879e c13879e = c6936e.f14227e;
        if (c10476e.m2822e(firebase, AbstractC17254e.f33803e)) {
            C6915e c6915e17 = c6936e2.f14226e;
            C6936e.yandex(c6915e17);
            c6915e17.mo2250e();
            contentValues.put("ad_services_version", Integer.valueOf(c0956e.inmobi));
            C6915e c6915e18 = c6936e2.f14226e;
            C6936e.yandex(c6915e18);
            c6915e18.mo2250e();
            contentValues.put("attribution_eligibility_status", Long.valueOf(c0956e.premium));
        }
        C6915e c6915e19 = c6936e2.f14226e;
        C6936e.yandex(c6915e19);
        c6915e19.mo2250e();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c0956e.isPro));
        contentValues.put("npa_metadata_value", c0956e.inmobi());
        C6915e c6915e20 = c6936e2.f14226e;
        C6936e.yandex(c6915e20);
        c6915e20.mo2250e();
        contentValues.put("bundle_delivery_index", Long.valueOf(c0956e.f3383class));
        contentValues.put("sgtm_preview_key", c0956e.crashlytics());
        C6936e.yandex(c6915e10);
        c6915e10.mo2250e();
        contentValues.put("dma_consent_state", Integer.valueOf(c0956e.crashlytics));
        C6936e.yandex(c6915e10);
        c6915e10.mo2250e();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c0956e.firebase));
        contentValues.put("serialized_npa_metadata", c0956e.remoteconfig());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c0956e.pro()));
        C6915e c6915e21 = c6936e2.f14226e;
        C6936e.yandex(c6915e21);
        c6915e21.mo2250e();
        ArrayList arrayList = c0956e.remoteconfig;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                C6936e.yandex(c13879e);
                c13879e.f27495e.vip(firebase, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (c10476e.m2822e(null, AbstractC17254e.f33847e) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        C6915e c6915e22 = c6936e2.f14226e;
        C6936e.yandex(c6915e22);
        c6915e22.mo2250e();
        contentValues.put("unmatched_pfo", c0956e.applovin);
        C6915e c6915e23 = c6936e2.f14226e;
        C6936e.yandex(c6915e23);
        c6915e23.mo2250e();
        contentValues.put("unmatched_uwa", c0956e.ads);
        C6915e c6915e24 = c6936e2.f14226e;
        C6936e.yandex(c6915e24);
        c6915e24.mo2250e();
        contentValues.put("ad_campaign_info", c0956e.f3386goto);
        if (c10476e.m2822e(firebase, AbstractC17254e.f33845e)) {
            C6915e c6915e25 = c6936e2.f14226e;
            C6936e.yandex(c6915e25);
            c6915e25.mo2250e();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(c0956e.f3389native));
        }
        try {
            SQLiteDatabase m533e = m533e();
            if (m533e.update("apps", contentValues, "app_id = ?", new String[]{firebase}) == 0 && m533e.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                C6936e.yandex(c13879e);
                c13879e.f27502e.vip(C13879e.m3689e(firebase), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            C6936e.yandex(c13879e);
            c13879e.f27502e.metrica(C13879e.m3689e(firebase), e, "Error storing app. appId");
        }
    }

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public final long m560e(String str) {
        AbstractC9528e.purchase(str);
        return m511e("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }
}
