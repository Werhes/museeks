package defpackage;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۙۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12724e extends AbstractC3947e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f25472e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public String f25473e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public List f25474e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final long f25475e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final String f25476e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public long f25477e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public String f25478e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f25479e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public String f25480e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public String f25481e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final long f25482e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public String f25483e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f25484e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f25485e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public String f25486e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f25487e;

    public C12724e(C6936e c6936e, long j, long j2, String str) {
        super(c6936e);
        this.f25477e = 0L;
        this.f25483e = null;
        this.f25475e = j;
        this.f25482e = j2;
        this.f25476e = str;
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final void m3390e() {
        String format;
        mo2250e();
        C6936e c6936e = (C6936e) this.f36443e;
        C1195e c1195e = c6936e.f14198e;
        C13879e c13879e = c6936e.f14227e;
        C6936e.purchase(c1195e);
        if (c1195e.m488e().startapp(EnumC9102e.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            C5240e c5240e = c6936e.f14223e;
            C6936e.purchase(c5240e);
            c5240e.m1834e().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            C6936e.yandex(c13879e);
            c13879e.f27496e.ad("Analytics Storage consent is not granted");
            format = null;
        }
        C6936e.yandex(c13879e);
        c13879e.f27496e.ad("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.f25478e = format;
        c6936e.f14215e.getClass();
        this.f25477e = System.currentTimeMillis();
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final String m3391e() {
        m1411e();
        AbstractC9528e.startapp(this.f25484e);
        return this.f25484e;
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final String m3392e() {
        mo2250e();
        m1411e();
        AbstractC9528e.startapp(this.f25480e);
        return this.f25480e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C8019e m3393e(java.lang.String r47) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12724e.m3393e(java.lang.String):eًٙۢ");
    }

    @Override // defpackage.AbstractC3947e
    /* renamed from: eّٖٗ */
    public final boolean mo803e() {
        return true;
    }
}
