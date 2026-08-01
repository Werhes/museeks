package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14834e extends AbstractC1487e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final HashMap f29364e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C5982e f29365e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C5982e f29366e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C5982e f29367e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C5982e f29368e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C5982e f29369e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C5982e f29370e;

    public C14834e(C15398e c15398e) {
        super(c15398e);
        this.f29364e = new HashMap();
        C1195e c1195e = ((C6936e) this.f36443e).f14198e;
        C6936e.purchase(c1195e);
        this.f29370e = new C5982e(c1195e, "last_delete_stale", 0L);
        C1195e c1195e2 = ((C6936e) this.f36443e).f14198e;
        C6936e.purchase(c1195e2);
        this.f29369e = new C5982e(c1195e2, "last_delete_stale_batch", 0L);
        C1195e c1195e3 = ((C6936e) this.f36443e).f14198e;
        C6936e.purchase(c1195e3);
        this.f29366e = new C5982e(c1195e3, "backoff", 0L);
        C1195e c1195e4 = ((C6936e) this.f36443e).f14198e;
        C6936e.purchase(c1195e4);
        this.f29368e = new C5982e(c1195e4, "last_upload", 0L);
        C1195e c1195e5 = ((C6936e) this.f36443e).f14198e;
        C6936e.purchase(c1195e5);
        this.f29365e = new C5982e(c1195e5, "last_upload_attempt", 0L);
        C1195e c1195e6 = ((C6936e) this.f36443e).f14198e;
        C6936e.purchase(c1195e6);
        this.f29367e = new C5982e(c1195e6, "midnight_offset", 0L);
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final Pair m3851e(String str) {
        C1818e c1818e;
        C1190e c1190e;
        mo2250e();
        C6936e c6936e = (C6936e) this.f36443e;
        C17647e c17647e = c6936e.f14215e;
        C10476e c10476e = c6936e.f14221e;
        c17647e.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f29364e;
        C1818e c1818e2 = (C1818e) hashMap.get(str);
        if (c1818e2 != null && elapsedRealtime < c1818e2.metrica) {
            return new Pair(c1818e2.ad, Boolean.valueOf(c1818e2.vip));
        }
        long m2816e = c10476e.m2816e(str, AbstractC17254e.vip) + elapsedRealtime;
        try {
            try {
                c1190e = C2698e.ad(c6936e.f14225e);
            } catch (PackageManager.NameNotFoundException unused) {
                if (c1818e2 != null && elapsedRealtime < c1818e2.metrica + c10476e.m2816e(str, AbstractC17254e.metrica)) {
                    return new Pair(c1818e2.ad, Boolean.valueOf(c1818e2.vip));
                }
                c1190e = null;
            }
        } catch (Exception e) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27496e.vip(e, "Unable to get advertising id");
            c1818e = new C1818e(m2816e, BuildConfig.FLAVOR, false);
        }
        if (c1190e == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = c1190e.metrica;
        c1818e = str2 != null ? new C1818e(m2816e, str2, c1190e.vip) : new C1818e(m2816e, BuildConfig.FLAVOR, c1190e.vip);
        hashMap.put(str, c1818e);
        return new Pair(c1818e.ad, Boolean.valueOf(c1818e.vip));
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final String m3852e(C8019e c8019e, C5291e c5291e) {
        String str = c8019e.f16300e;
        AbstractC9528e.purchase(str);
        if (!c5291e.startapp(EnumC9102e.AD_STORAGE) || !c8019e.f16278e) {
            return BuildConfig.FLAVOR;
        }
        mo2250e();
        String str2 = (String) m3851e(str).first;
        MessageDigest m1789e = C5240e.m1789e();
        if (m1789e == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m1789e.digest(str2.getBytes())));
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final Pair m3853e(C8019e c8019e, C5291e c5291e) {
        String str = c8019e.f16300e;
        AbstractC9528e.purchase(str);
        return (c5291e.startapp(EnumC9102e.AD_STORAGE) && c8019e.f16278e) ? m3851e(str) : new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
    }

    @Override // defpackage.AbstractC1487e
    /* renamed from: eّٖٗ */
    public final void mo554e() {
    }
}
