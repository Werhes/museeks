package defpackage;

import java.security.AccessControlException;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4756e implements InterfaceC7539e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final HashMap f10177e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final boolean f10178e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String[] f10179e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f10180e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f10181e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public String[] f10182e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String[] f10183e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int[] f10184e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public EnumC5730e f10185e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public String[] f10186e;

    static {
        try {
            f10178e = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f10178e = false;
        }
        HashMap hashMap = new HashMap();
        f10177e = hashMap;
        C12816e c12816e = new C12816e("kotlin.jvm.internal.KotlinClass");
        hashMap.put(new C11709e(c12816e.vip(), c12816e.ad.billing()), EnumC5730e.CLASS);
        C12816e c12816e2 = new C12816e("kotlin.jvm.internal.KotlinFileFacade");
        hashMap.put(new C11709e(c12816e2.vip(), c12816e2.ad.billing()), EnumC5730e.FILE_FACADE);
        C12816e c12816e3 = new C12816e("kotlin.jvm.internal.KotlinMultifileClass");
        hashMap.put(new C11709e(c12816e3.vip(), c12816e3.ad.billing()), EnumC5730e.MULTIFILE_CLASS);
        C12816e c12816e4 = new C12816e("kotlin.jvm.internal.KotlinMultifileClassPart");
        hashMap.put(new C11709e(c12816e4.vip(), c12816e4.ad.billing()), EnumC5730e.MULTIFILE_CLASS_PART);
        C12816e c12816e5 = new C12816e("kotlin.jvm.internal.KotlinSyntheticClass");
        hashMap.put(new C11709e(c12816e5.vip(), c12816e5.ad.billing()), EnumC5730e.SYNTHETIC_CLASS);
    }

    @Override // defpackage.InterfaceC7539e
    public final InterfaceC15813e metrica(C11709e c11709e, C0515e c0515e) {
        EnumC5730e enumC5730e;
        C12816e ad = c11709e.ad();
        if (ad.equals(AbstractC15262e.ad)) {
            return new C7988e(20, this);
        }
        if (ad.equals(AbstractC15262e.loadAd)) {
            return new C16089e(this);
        }
        if (f10178e || this.f10185e != null || (enumC5730e = (EnumC5730e) f10177e.get(c11709e)) == null) {
            return null;
        }
        this.f10185e = enumC5730e;
        return new C13935e(this);
    }
}
