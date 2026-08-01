package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9223e extends SQLiteOpenHelper {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Cpackage f18409e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18410e;

    public C9223e(Context context, String str) {
        super(context, true == str.equals(BuildConfig.FLAVOR) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9223e(C1248e c1248e, Context context) {
        this(context, "google_app_measurement.db");
        this.f18410e = 0;
        this.f18409e = c1248e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9223e(C13185e c13185e, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f18410e = 1;
        this.f18409e = c13185e;
    }

    private final void ad(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void advert(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void license(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void purchase(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f18410e) {
            case 0:
                C1248e c1248e = (C1248e) this.f18409e;
                C6936e c6936e = (C6936e) c1248e.f36443e;
                C6936e c6936e2 = (C6936e) c1248e.f36443e;
                c6936e.getClass();
                C3318e c3318e = c1248e.f3947e;
                if (c3318e.f7486e != 0) {
                    ((C17647e) c3318e.f7485e).getClass();
                    if (SystemClock.elapsedRealtime() - c3318e.f7486e < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((C17647e) c3318e.f7485e).getClass();
                    c3318e.f7486e = SystemClock.elapsedRealtime();
                    C13879e c13879e = c6936e2.f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27502e.ad("Opening the database failed, dropping and recreating it");
                    if (!c6936e2.f14225e.getDatabasePath("google_app_measurement.db").delete()) {
                        C13879e c13879e2 = c6936e2.f14227e;
                        C6936e.yandex(c13879e2);
                        c13879e2.f27502e.vip("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        c3318e.f7486e = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        C13879e c13879e3 = c6936e2.f14227e;
                        C6936e.yandex(c13879e3);
                        c13879e3.f27502e.vip(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                C13185e c13185e = (C13185e) this.f18409e;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    C6936e c6936e3 = (C6936e) c13185e.f36443e;
                    C13879e c13879e4 = c6936e3.f14227e;
                    C6936e.yandex(c13879e4);
                    c13879e4.f27502e.ad("Opening the local database failed, dropping and recreating it");
                    if (!c6936e3.f14225e.getDatabasePath("google_app_measurement_local.db").delete()) {
                        C13879e c13879e5 = c6936e3.f14227e;
                        C6936e.yandex(c13879e5);
                        c13879e5.f27502e.vip("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        C13879e c13879e6 = ((C6936e) c13185e.f36443e).f14227e;
                        C6936e.yandex(c13879e6);
                        c13879e6.f27502e.vip(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f18410e) {
            case 0:
                C13879e c13879e = ((C6936e) ((C1248e) this.f18409e).f36443e).f14227e;
                C6936e.yandex(c13879e);
                AbstractC12511e.startapp(c13879e, sQLiteDatabase);
                return;
            default:
                C13879e c13879e2 = ((C6936e) ((C13185e) this.f18409e).f36443e).f14227e;
                C6936e.yandex(c13879e2);
                AbstractC12511e.startapp(c13879e2, sQLiteDatabase);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f18410e;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.f18410e) {
            case 0:
                C6936e c6936e = (C6936e) ((C1248e) this.f18409e).f36443e;
                C13879e c13879e = c6936e.f14227e;
                C6936e.yandex(c13879e);
                AbstractC12511e.yandex(c13879e, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C1248e.f3945e);
                C13879e c13879e2 = c6936e.f14227e;
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C1248e.f3944e);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C1248e.f3937e);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C1248e.f3936e);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C1248e.f3943e);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C1248e.f3935e);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C1248e.f3938e);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C1248e.f3940e);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C1248e.f3941e);
                C4261e.ad();
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C1248e.f3939e);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C1248e.f3942e);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                C6936e.yandex(c13879e2);
                AbstractC12511e.yandex(c13879e2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                return;
            default:
                C13879e c13879e3 = ((C6936e) ((C13185e) this.f18409e).f36443e).f14227e;
                C6936e.yandex(c13879e3);
                AbstractC12511e.yandex(c13879e3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", C13185e.f26186e);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f18410e;
    }
}
