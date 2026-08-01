package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC7799e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f15802e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f15803e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f15804e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f15805e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15806e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Object f15807e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f15808e;

    public RunnableC7799e(C13879e c13879e, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f15804e = i;
        this.f15803e = str;
        this.f15805e = obj;
        this.f15802e = obj2;
        this.f15808e = obj3;
        this.f15807e = c13879e;
    }

    public /* synthetic */ RunnableC7799e(String str, InterfaceC5000e interfaceC5000e, int i, IOException iOException, byte[] bArr, Map map) {
        AbstractC9528e.startapp(interfaceC5000e);
        this.f15805e = interfaceC5000e;
        this.f15804e = i;
        this.f15802e = iOException;
        this.f15808e = bArr;
        this.f15803e = str;
        this.f15807e = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15806e) {
            case 0:
                C13879e c13879e = (C13879e) this.f15807e;
                C1195e c1195e = ((C6936e) c13879e.f36443e).f14198e;
                C6936e.purchase(c1195e);
                if (!c1195e.f15961e) {
                    Log.println(6, c13879e.m3695e(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (c13879e.f27500e == 0) {
                    C10476e c10476e = ((C6936e) c13879e.f36443e).f14221e;
                    if (c10476e.f20688e == null) {
                        synchronized (c10476e) {
                            try {
                                if (c10476e.f20688e == null) {
                                    C6936e c6936e = (C6936e) c10476e.f36443e;
                                    ApplicationInfo applicationInfo = c6936e.f14225e.getApplicationInfo();
                                    String tapsense = AbstractC17305e.tapsense();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c10476e.f20688e = Boolean.valueOf(str != null && str.equals(tapsense));
                                    }
                                    if (c10476e.f20688e == null) {
                                        c10476e.f20688e = Boolean.TRUE;
                                        C13879e c13879e2 = c6936e.f14227e;
                                        C6936e.yandex(c13879e2);
                                        c13879e2.f27502e.ad("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (c10476e.f20688e.booleanValue()) {
                        c13879e.f27500e = 'C';
                    } else {
                        c13879e.f27500e = 'c';
                    }
                }
                if (c13879e.f27492e < 0) {
                    ((C6936e) c13879e.f36443e).f14221e.m2814e();
                    c13879e.f27492e = 161000L;
                }
                int i = this.f15804e;
                char c = c13879e.f27500e;
                long j = c13879e.f27492e;
                String str2 = this.f15803e;
                Object obj = this.f15805e;
                Object obj2 = this.f15802e;
                Object obj3 = this.f15808e;
                char charAt = "01VDIWEA?".charAt(i);
                String m3690e = C13879e.m3690e(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(AbstractC8703e.crashlytics(String.valueOf(charAt).length() + 1, String.valueOf(c).length(), String.valueOf(j).length(), 1) + m3690e.length());
                sb.append("2");
                sb.append(charAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(m3690e);
                String sb2 = sb.toString();
                if (sb2.length() > 1024) {
                    sb2 = str2.substring(0, 1024);
                }
                C9156e c9156e = c1195e.f3820e;
                if (c9156e != null) {
                    String str3 = (String) c9156e.f18317e;
                    C1195e c1195e2 = (C1195e) c9156e.f18314e;
                    c1195e2.mo2250e();
                    if (((C1195e) c9156e.f18314e).m490e().getLong((String) c9156e.f18316e, 0L) == 0) {
                        c9156e.subs();
                    }
                    if (sb2 == null) {
                        sb2 = BuildConfig.FLAVOR;
                    }
                    SharedPreferences m490e = c1195e2.m490e();
                    String str4 = (String) c9156e.f18315e;
                    long j2 = m490e.getLong(str4, 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor edit = c1195e2.m490e().edit();
                        edit.putString(str3, sb2);
                        edit.putLong(str4, 1L);
                        edit.apply();
                        return;
                    }
                    C5240e c5240e = ((C6936e) c1195e2.f36443e).f14223e;
                    C6936e.purchase(c5240e);
                    long nextLong = c5240e.m1834e().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor edit2 = c1195e2.m490e().edit();
                    if (nextLong < j4) {
                        edit2.putString(str3, sb2);
                    }
                    edit2.putLong(str4, j3);
                    edit2.apply();
                    return;
                }
                return;
            default:
                ((InterfaceC5000e) this.f15805e).appmetrica(this.f15803e, this.f15804e, (Throwable) this.f15802e, (byte[]) this.f15808e, (Map) this.f15807e);
                return;
        }
    }
}
