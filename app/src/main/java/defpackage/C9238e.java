package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9238e implements InterfaceC1272e {
    public InterfaceC5483e ad;
    public InterfaceC13782e appmetrica;
    public long billing;
    public long license;
    public int metrica;
    public int purchase;
    public InterfaceC18147e vip;

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        this.metrica = j == 0 ? 0 : 4;
        InterfaceC13782e interfaceC13782e = this.appmetrica;
        if (interfaceC13782e != null) {
            interfaceC13782e.ad(j2);
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        return AbstractC8210e.metrica(interfaceC2283e);
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.ad = interfaceC5483e;
        this.vip = interfaceC5483e.Signature(0, 1);
        interfaceC5483e.mopub();
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0213, code lost:
    
        if (r9 != 65534) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021a, code lost:
    
        if (r2 == 32) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    /* JADX WARN: Type inference failed for: r1v3, types: [eۢؑ, java.lang.Object] */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.InterfaceC2283e r21, defpackage.C14829e r22) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9238e.vip(eَؔؐ, eٜٔؓ):int");
    }
}
