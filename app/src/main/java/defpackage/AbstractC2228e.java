package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۦٌ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2228e implements InterfaceC4766e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Thread f5679e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f5680e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final UUID f5681e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f5682e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC2228e f5683e;

    public AbstractC2228e(String str, AbstractC2228e abstractC2228e, C17823e c17823e) {
        str.getClass();
        this.f5682e = str;
        this.f5683e = abstractC2228e;
        this.f5681e = abstractC2228e.f5681e;
        this.f5680e = abstractC2228e.f5680e;
        this.f5679e = Thread.currentThread();
    }

    public AbstractC2228e(String str, UUID uuid, String str2, C17823e c17823e) {
        str.getClass();
        this.f5682e = str;
        this.f5683e = null;
        this.f5681e = uuid;
        this.f5680e = str2;
        c17823e.getClass();
        this.f5679e = Thread.currentThread();
    }

    public static String ad(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C17823e vip = AbstractC5076e.vip();
        InterfaceC4766e interfaceC4766e = vip.vip;
        String str = this.f5682e;
        if (interfaceC4766e == null) {
            throw new C9442e(AbstractC8647e.ads(new StringBuilder(String.valueOf(str).length() + EnergyProfile.EVCONNECTOR_TYPE_OTHER), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."), 13);
        }
        if (this == interfaceC4766e) {
            AbstractC5076e.ad(vip, ((AbstractC2228e) interfaceC4766e).f5683e);
            this.f5679e = null;
            return;
        }
        String str2 = ((AbstractC2228e) interfaceC4766e).f5682e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length() + 1);
        AbstractC13501e.Signature(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb.append(".");
        throw new C9442e(sb.toString(), 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ab, code lost:
    
        r15 = ((defpackage.C16121e) r1.f2468e).license;
        r16 = r6;
        r6 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bb, code lost:
    
        if (r15.containsKey(r6) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bd, code lost:
    
        ((defpackage.C16121e) r1.f2468e).license.put(r6, new defpackage.C16121e(r7, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cb, code lost:
    
        if (r14 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cd, code lost:
    
        r14.metrica = (defpackage.C16121e) r1.f2468e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00de, code lost:
    
        if (r14 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e0, code lost:
    
        r14.metrica = (defpackage.C16121e) r1.f2468e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e6, code lost:
    
        r1.f2465e = r7;
        r1.f2464e++;
        r1.billing();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f2, code lost:
    
        if (r1.mopub(r13, r14, r15, (r15 + r14) - r13) != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2228e.toString():java.lang.String");
    }
}
