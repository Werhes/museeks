package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Objects;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۜۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9770e implements InterfaceC2062e, InterfaceC17000e, InterfaceC17386e, InterfaceC11455e, InterfaceC14711e, InterfaceC11306e, InterfaceC13344e, InterfaceC2789e, InterfaceC15269e, InterfaceC11104e, InterfaceC3934e, InterfaceC7081e, InterfaceC7898e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static volatile C9770e f19314e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f19315e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19316e;

    public C9770e(int i) {
        this.f19316e = i;
        switch (i) {
            case 7:
                this.f19315e = AbstractC5756e.metrica(Looper.getMainLooper());
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.f19315e = new Object();
                return;
            case 21:
                this.f19315e = (ExtraCroppingQuirk) AbstractC16338e.ad(ExtraCroppingQuirk.class);
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f19315e = new C4524e(27);
                return;
            default:
                this.f19315e = r3;
                String[] strArr = {"Other", "Standard CD album with other songs", "Compressed audio on CD", "File over the Internet", "Stream over the Internet", "As note sheets", "As note sheets in a book with other sheets", "Music on other media", "Non-musical merchandise"};
                return;
        }
    }

    public /* synthetic */ C9770e(int i, Object obj) {
        this.f19316e = i;
        this.f19315e = obj;
    }

    public /* synthetic */ C9770e(int i, boolean z) {
        this.f19316e = i;
    }

    public C9770e(C0731e c0731e, C14240e c14240e) {
        this.f19316e = 28;
        this.f19315e = c14240e;
        Objects.requireNonNull(c0731e);
    }

    public C9770e(InterfaceC2141e interfaceC2141e, InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e, int i) {
        this.f19316e = 25;
        this.f19315e = i > 0 ? new C6029e(i) : null;
    }

    public C9770e(C6831e c6831e) {
        this.f19316e = 18;
        int i = c6831e.billing;
        this.f19315e = new C18478e[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((C18478e[]) this.f19315e)[i2] = new C18478e(c6831e);
        }
    }

    public C9770e(InputStream inputStream) {
        this.f19316e = 12;
        this.f19315e = new C17044e(inputStream, AbstractC5508e.ad);
    }

    public static void Signature(C4734e c4734e) {
        c4734e.isVip("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4734e.isVip("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c4734e.isVip("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c4734e.isVip("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        c4734e.isVip("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c4734e.isVip("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        c4734e.isVip("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4734e.isVip("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c4734e.isVip("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4734e.isVip("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4734e.isVip("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c4734e.isVip("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4734e.isVip("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c4734e.isVip("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c4734e.isVip("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static C1190e applovin(C4734e c4734e) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new C3824e(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap.put("prerequisite_id", new C3824e(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C4898e("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C4898e("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C10475e("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
        hashSet2.add(new C10475e("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
        C1651e c1651e = new C1651e("Dependency", hashMap, hashSet, hashSet2);
        C1651e ad = C1651e.ad(c4734e, "Dependency");
        if (!c1651e.equals(ad)) {
            return new C1190e("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c1651e + "\n Found:\n" + ad, false);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new C3824e(1, 1, "id", "TEXT", null, true));
        hashMap2.put("state", new C3824e(0, 1, "state", "INTEGER", null, true));
        hashMap2.put("worker_class_name", new C3824e(0, 1, "worker_class_name", "TEXT", null, true));
        hashMap2.put("input_merger_class_name", new C3824e(0, 1, "input_merger_class_name", "TEXT", null, false));
        hashMap2.put("input", new C3824e(0, 1, "input", "BLOB", null, true));
        hashMap2.put("output", new C3824e(0, 1, "output", "BLOB", null, true));
        hashMap2.put("initial_delay", new C3824e(0, 1, "initial_delay", "INTEGER", null, true));
        hashMap2.put("interval_duration", new C3824e(0, 1, "interval_duration", "INTEGER", null, true));
        hashMap2.put("flex_duration", new C3824e(0, 1, "flex_duration", "INTEGER", null, true));
        hashMap2.put("run_attempt_count", new C3824e(0, 1, "run_attempt_count", "INTEGER", null, true));
        hashMap2.put("backoff_policy", new C3824e(0, 1, "backoff_policy", "INTEGER", null, true));
        hashMap2.put("backoff_delay_duration", new C3824e(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        hashMap2.put("period_start_time", new C3824e(0, 1, "period_start_time", "INTEGER", null, true));
        hashMap2.put("minimum_retention_duration", new C3824e(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        hashMap2.put("schedule_requested_at", new C3824e(0, 1, "schedule_requested_at", "INTEGER", null, true));
        hashMap2.put("run_in_foreground", new C3824e(0, 1, "run_in_foreground", "INTEGER", null, true));
        hashMap2.put("out_of_quota_policy", new C3824e(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        hashMap2.put("required_network_type", new C3824e(0, 1, "required_network_type", "INTEGER", null, false));
        hashMap2.put("requires_charging", new C3824e(0, 1, "requires_charging", "INTEGER", null, true));
        hashMap2.put("requires_device_idle", new C3824e(0, 1, "requires_device_idle", "INTEGER", null, true));
        hashMap2.put("requires_battery_not_low", new C3824e(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        hashMap2.put("requires_storage_not_low", new C3824e(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        hashMap2.put("trigger_content_update_delay", new C3824e(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        hashMap2.put("trigger_max_content_delay", new C3824e(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        hashMap2.put("content_uri_triggers", new C3824e(0, 1, "content_uri_triggers", "BLOB", null, false));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new C10475e("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
        hashSet4.add(new C10475e("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
        C1651e c1651e2 = new C1651e("WorkSpec", hashMap2, hashSet3, hashSet4);
        C1651e ad2 = C1651e.ad(c4734e, "WorkSpec");
        if (!c1651e2.equals(ad2)) {
            return new C1190e("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c1651e2 + "\n Found:\n" + ad2, false);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new C3824e(1, 1, "tag", "TEXT", null, true));
        hashMap3.put("work_spec_id", new C3824e(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C4898e("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C10475e("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
        C1651e c1651e3 = new C1651e("WorkTag", hashMap3, hashSet5, hashSet6);
        C1651e ad3 = C1651e.ad(c4734e, "WorkTag");
        if (!c1651e3.equals(ad3)) {
            return new C1190e("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c1651e3 + "\n Found:\n" + ad3, false);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new C3824e(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap4.put("system_id", new C3824e(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C4898e("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C1651e c1651e4 = new C1651e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        C1651e ad4 = C1651e.ad(c4734e, "SystemIdInfo");
        if (!c1651e4.equals(ad4)) {
            return new C1190e("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c1651e4 + "\n Found:\n" + ad4, false);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new C3824e(1, 1, "name", "TEXT", null, true));
        hashMap5.put("work_spec_id", new C3824e(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C4898e("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new C10475e("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
        C1651e c1651e5 = new C1651e("WorkName", hashMap5, hashSet8, hashSet9);
        C1651e ad5 = C1651e.ad(c4734e, "WorkName");
        if (!c1651e5.equals(ad5)) {
            return new C1190e("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c1651e5 + "\n Found:\n" + ad5, false);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new C3824e(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap6.put("progress", new C3824e(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C4898e("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C1651e c1651e6 = new C1651e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        C1651e ad6 = C1651e.ad(c4734e, "WorkProgress");
        if (!c1651e6.equals(ad6)) {
            return new C1190e("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c1651e6 + "\n Found:\n" + ad6, false);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new C3824e(1, 1, "key", "TEXT", null, true));
        hashMap7.put("long_value", new C3824e(0, 1, "long_value", "INTEGER", null, false));
        C1651e c1651e7 = new C1651e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        C1651e ad7 = C1651e.ad(c4734e, "Preference");
        if (c1651e7.equals(ad7)) {
            return new C1190e(null, true);
        }
        return new C1190e("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c1651e7 + "\n Found:\n" + ad7, false);
    }

    public static C9770e signatures() {
        if (f19314e == null) {
            synchronized (C9770e.class) {
                try {
                    if (f19314e == null) {
                        f19314e = new C9770e(0);
                    }
                } finally {
                }
            }
        }
        return f19314e;
    }

    @Override // defpackage.InterfaceC11455e
    public long adcel(int i) {
        AbstractC2301e.billing(i == 0);
        return 0L;
    }

    public void admob(byte b) {
        ((Parcel) this.f19315e).writeByte(b);
    }

    public void ads() {
        int i = 0;
        while (true) {
            C18478e[] c18478eArr = (C18478e[]) this.f19315e;
            if (i >= c18478eArr.length) {
                return;
            }
            c18478eArr[i].m4559transient();
            i++;
        }
    }

    @Override // defpackage.InterfaceC11455e
    public List advert(long j) {
        return j >= 0 ? (List) this.f19315e : Collections.EMPTY_LIST;
    }

    public void amazon(C9770e c9770e) {
        int i = 0;
        while (true) {
            C18478e[] c18478eArr = (C18478e[]) this.f19315e;
            if (i >= c18478eArr.length) {
                return;
            }
            System.arraycopy((int[]) c18478eArr[i].f36228e, 0, (int[]) ((C18478e[]) c9770e.f19315e)[i].f36228e, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            i++;
        }
    }

    @Override // defpackage.InterfaceC17000e
    public void appmetrica(int i, int i2) {
        ((AbstractC5604e) this.f19315e).Signature(i, i2);
    }

    @Override // defpackage.InterfaceC17000e
    public void billing(int i, int i2) {
        ((AbstractC5604e) this.f19315e).admob(i, i2);
    }

    public void crashlytics() {
        View view;
        View view2 = (View) this.f19315e;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new RunnableC16165e(view, 1));
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        try {
            return ((C3509e) this.f19315e).doFinal(bArr, 0);
        } catch (C6061e e) {
            throw new IllegalStateException(e.toString());
        }
    }

    @Override // defpackage.InterfaceC2789e
    /* renamed from: eؘٖؕ */
    public int mo1205e(char[] cArr, int i, int i2) {
        return ((C17044e) this.f19315e).ad(cArr, i, i2);
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        switch (this.f19316e) {
            case 13:
                return new C7927e((Context) ((C15816e) this.f19315e).f31190e);
            default:
                return new C12632e((C7596e) ((InterfaceC16964e) this.f19315e).get());
        }
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        return ((C3509e) this.f19315e).ad.getAlgorithmName() + "-GMAC";
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return 16;
    }

    @Override // defpackage.InterfaceC2062e
    public String getValue(int i) {
        String str;
        return (mo269instanceof(i) && (str = ((String[]) this.f19315e)[i]) != null) ? str : BuildConfig.FLAVOR;
    }

    @Override // defpackage.InterfaceC11306e
    public void init(InterfaceC3894e interfaceC3894e) {
        if (!(interfaceC3894e instanceof C11494e)) {
            throw new IllegalArgumentException("GMAC requires ParametersWithIV");
        }
        C11494e c11494e = (C11494e) interfaceC3894e;
        byte[] bArr = c11494e.f23095e;
        ((C3509e) this.f19315e).init(true, new smaato((C14915e) c11494e.f23094e, 128, bArr, null));
    }

    public void inmobi(String str, List list, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", AbstractC11866e.vip(list, MediaBrowserCompat$MediaItem.CREATOR));
        }
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.arg1 = 2;
        obtain.setData(bundle3);
        ((Messenger) this.f19315e).send(obtain);
    }

    @Override // defpackage.InterfaceC2062e
    /* renamed from: instanceof */
    public boolean mo269instanceof(int i) {
        return i >= 0 && i <= 8;
    }

    public void isPro() {
        C2247e c2247e = (C2247e) this.f19315e;
        int i = c2247e.f5709e - 1;
        c2247e.f5709e = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (C2220e c2220e : c2247e.f5725e) {
            c2220e.isVip();
            i2 += c2220e.f5639e.ad;
        }
        C16437e[] c16437eArr = new C16437e[i2];
        int i3 = 0;
        for (C2220e c2220e2 : c2247e.f5725e) {
            c2220e2.isVip();
            int i4 = c2220e2.f5639e.ad;
            int i5 = 0;
            while (i5 < i4) {
                c2220e2.isVip();
                c16437eArr[i3] = c2220e2.f5639e.ad(i5);
                i5++;
                i3++;
            }
        }
        c2247e.f5717e = new C12931e(c16437eArr);
        c2247e.f5711e.ad(c2247e);
    }

    public void isVip() {
        View view = (View) this.f19315e;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.InterfaceC7898e
    public void license(Object obj) {
        switch (this.f19316e) {
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C8988e) ((C14240e) this.f19315e).f28127e).ad.admob();
                return;
            default:
                C3125e c3125e = (C3125e) obj;
                C18482e c18482e = C11909e.license;
                boolean z = false;
                if (c3125e != null) {
                    C13975e c13975e = c3125e.ad.f35610e;
                    AbstractC9528e.startapp(c13975e);
                    if (c13975e.f27697e == 1) {
                        z = true;
                    }
                }
                ((C8988e) this.f19315e).license(Boolean.valueOf(z));
                return;
        }
    }

    @Override // defpackage.InterfaceC11455e
    public int loadAd() {
        return 1;
    }

    @Override // defpackage.InterfaceC17000e
    public void metrica(int i, int i2) {
        ((AbstractC5604e) this.f19315e).smaato(i, i2);
    }

    @Override // defpackage.InterfaceC13344e
    public void mopub(InterfaceC14585e interfaceC14585e) {
        C2247e c2247e = (C2247e) this.f19315e;
        c2247e.f5711e.mopub(c2247e);
    }

    public synchronized void premium(C0970e c0970e) {
        try {
            C0970e c0970e2 = c0970e.appmetrica;
            C0970e c0970e3 = c0970e.license;
            c0970e.appmetrica = null;
            c0970e.license = null;
            if (c0970e3 != null) {
                c0970e3.appmetrica = c0970e2;
            } else {
                this.f19315e = c0970e2;
            }
            if (c0970e2 != null) {
                c0970e2.license = c0970e3;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC3934e
    public C17985e pro(C17985e c17985e, float f, C7695e c7695e) {
        ((C15325e) this.f19315e).pro(c17985e, f, c7695e);
        return c17985e;
    }

    @Override // defpackage.InterfaceC11455e
    public int purchase(long j) {
        return j < 0 ? 0 : -1;
    }

    public void remoteconfig(long j) {
        long vip = C12973e.vip(j);
        byte b = 0;
        if (!C4616e.ad(vip, 0L)) {
            if (C4616e.ad(vip, 4294967296L)) {
                b = 1;
            } else if (C4616e.ad(vip, 8589934592L)) {
                b = 2;
            }
        }
        admob(b);
        if (C4616e.ad(C12973e.vip(j), 0L)) {
            return;
        }
        subscription(C12973e.metrica(j));
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        ((C3509e) this.f19315e).mopub(true);
    }

    @Override // defpackage.InterfaceC17386e
    public boolean smaato(MenuC8939e menuC8939e) {
        Window.Callback callback;
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) this.f19315e;
        if (menuC8939e != menuC8939e.mopub() || !layoutInflaterFactory2C8158e.f16573e || (callback = layoutInflaterFactory2C8158e.f16563e.getCallback()) == null || layoutInflaterFactory2C8158e.f16605e) {
            return true;
        }
        callback.onMenuOpened(108, menuC8939e);
        return true;
    }

    @Override // defpackage.InterfaceC17000e
    public void startapp(int i, int i2) {
        ((AbstractC5604e) this.f19315e).amazon(i, i2, null);
    }

    public void subs(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f19315e;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void subscription(float f) {
        ((Parcel) this.f19315e).writeFloat(f);
    }

    public C10688e tapsense(InterfaceC17544e interfaceC17544e, InterfaceC8614e interfaceC8614e) {
        InterfaceC7227e interfaceC7227e = (InterfaceC7227e) this.f19315e;
        if (!C7290e.yandex(interfaceC17544e)) {
            throw new IllegalStateException("Unmanaged objects don't support backlinks.");
        }
        C13655e f36708e = ((InterfaceC10518e) interfaceC17544e).getF36708e();
        C16406e c16406e = (C16406e) f36708e.f27076e.license.get(interfaceC8614e);
        if (c16406e == null) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Target property '", interfaceC8614e.getName(), "' not defined in '", AbstractC3820e.ad.vip(interfaceC17544e.getClass()).mopub(), "'."));
        }
        String str = c16406e.adcel;
        if (str.length() == 0) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("Target property '", interfaceC8614e.getName(), "' is not a backlink property."));
        }
        C18085e metrica = f36708e.f27072e.advert().metrica(c16406e.startapp);
        InterfaceC7227e interfaceC7227e2 = metrica.startapp;
        if (!AbstractC7890e.billing(interfaceC7227e, interfaceC7227e2)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Target property type '", interfaceC7227e2.mopub(), "' does not match backlink type '", interfaceC7227e.mopub(), "'."));
        }
        long j = ((C16406e) metrica.appmetrica.get(str)).license;
        long j2 = metrica.vip;
        InterfaceC7227e interfaceC7227e3 = (InterfaceC7227e) this.f19315e;
        long ptr$cinterop_release = f36708e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return new C10688e(new C1649e(f36708e.f27072e, new LongPointerWrapper(realmcJNI.realm_get_backlinks(ptr$cinterop_release, j2, j), false, 2, null), j2, interfaceC7227e3, f36708e.f27074e));
    }

    public String toString() {
        switch (this.f19316e) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C18478e[] c18478eArr = (C18478e[]) this.f19315e;
                String str = "\n[";
                for (int i = 0; i < c18478eArr.length; i++) {
                    str = str + "Inner Matrix " + i + " " + c18478eArr[i].toString();
                    if (i != c18478eArr.length - 1) {
                        str = AbstractC10257e.adcel(str, ",\n");
                    }
                }
                return AbstractC10257e.adcel(str, "]");
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return String.valueOf((C2443e) this.f19315e);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte b) {
        C3509e c3509e = (C3509e) this.f19315e;
        c3509e.metrica();
        byte[] bArr = c3509e.signatures;
        int i = c3509e.tapsense;
        bArr[i] = b;
        int i2 = i + 1;
        c3509e.tapsense = i2;
        if (i2 == 16) {
            c3509e.purchase(c3509e.loadAd, bArr);
            c3509e.tapsense = 0;
            c3509e.isVip += 16;
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte[] bArr, int i, int i2) {
        ((C3509e) this.f19315e).ad(i, i2, bArr);
    }

    @Override // defpackage.InterfaceC17386e
    public void vip(MenuC8939e menuC8939e, boolean z) {
        C16951e c16951e;
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) this.f19315e;
        MenuC8939e mopub = menuC8939e.mopub();
        int i = 0;
        boolean z2 = mopub != menuC8939e;
        if (z2) {
            menuC8939e = mopub;
        }
        C16951e[] c16951eArr = layoutInflaterFactory2C8158e.f16606e;
        int length = c16951eArr != null ? c16951eArr.length : 0;
        while (true) {
            if (i < length) {
                c16951e = c16951eArr[i];
                if (c16951e != null && c16951e.yandex == menuC8939e) {
                    break;
                } else {
                    i++;
                }
            } else {
                c16951e = null;
                break;
            }
        }
        if (c16951e != null) {
            if (!z2) {
                layoutInflaterFactory2C8158e.signatures(c16951e, z);
            } else {
                layoutInflaterFactory2C8158e.remoteconfig(c16951e.ad, c16951e, mopub);
                layoutInflaterFactory2C8158e.signatures(c16951e, true);
            }
        }
    }

    @Override // defpackage.InterfaceC14711e
    public boolean yandex(C1622e c1622e) {
        return c1622e.m658e((C1622e) this.f19315e);
    }
}
