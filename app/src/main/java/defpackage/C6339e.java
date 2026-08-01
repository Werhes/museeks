package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6339e extends AbstractC9748e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f13179e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2271e f13180e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C2271e f13181e;

    /* JADX WARN: Type inference failed for: r2v1, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [eٕ٘ؔ, eؓۨۖ] */
    public C6339e(C6936e c6936e) {
        super(c6936e);
        this.f13181e = new C17519e(0);
        this.f13180e = new C17519e(0);
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final void m2153e(String str, long j, C13288e c13288e) {
        C6936e c6936e = (C6936e) this.f36443e;
        if (c13288e == null) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27497e.ad("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                C13879e c13879e2 = c6936e.f14227e;
                C6936e.yandex(c13879e2);
                c13879e2.f27497e.vip(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C5240e.m1787e(c13288e, bundle, true);
            C8320e c8320e = c6936e.f14199e;
            C6936e.billing(c8320e);
            c8320e.m2406e("am", "_xu", bundle);
        }
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final void m2154e(long j) {
        C2271e c2271e = this.f13180e;
        Iterator it = ((C15627e) c2271e.keySet()).iterator();
        while (it.hasNext()) {
            c2271e.put((String) it.next(), Long.valueOf(j));
        }
        if (c2271e.isEmpty()) {
            return;
        }
        this.f13179e = j;
    }

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public final void m2155e(long j, String str) {
        C6936e c6936e = (C6936e) this.f36443e;
        if (str == null || str.length() == 0) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Ad unit id must be a non-empty string");
        } else {
            C6915e c6915e = c6936e.f14226e;
            C6936e.yandex(c6915e);
            c6915e.m2254e(new RunnableC15138e(this, str, j, 0));
        }
    }

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final void m2156e(long j, String str) {
        C6936e c6936e = (C6936e) this.f36443e;
        if (str == null || str.length() == 0) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Ad unit id must be a non-empty string");
        } else {
            C6915e c6915e = c6936e.f14226e;
            C6936e.yandex(c6915e);
            c6915e.m2254e(new RunnableC15138e(this, str, j, 1));
        }
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final void m2157e(long j, C13288e c13288e) {
        C6936e c6936e = (C6936e) this.f36443e;
        if (c13288e == null) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27497e.ad("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27497e.vip(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C5240e.m1787e(c13288e, bundle, true);
            C8320e c8320e = c6936e.f14199e;
            C6936e.billing(c8320e);
            c8320e.m2406e("am", "_xa", bundle);
        }
    }

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final void m2158e(long j) {
        C10693e c10693e = ((C6936e) this.f36443e).f14200e;
        C6936e.billing(c10693e);
        C13288e m2914e = c10693e.m2914e(false);
        C2271e c2271e = this.f13180e;
        Iterator it = ((C15627e) c2271e.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m2153e(str, j - ((Long) c2271e.get(str)).longValue(), m2914e);
        }
        if (!c2271e.isEmpty()) {
            m2157e(j - this.f13179e, m2914e);
        }
        m2154e(j);
    }
}
