package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1402e extends AbstractC1101e {
    public static final byte[] billing;
    public static final C14133e purchase;
    public static final byte[] startapp;
    public static final byte[] yandex;
    public long appmetrica;
    public final C14133e license;
    public final List metrica;
    public final C0193e vip;

    static {
        C10445e c10445e = C14133e.license;
        AbstractC1266e.vip("multipart/mixed");
        AbstractC1266e.vip("multipart/alternative");
        AbstractC1266e.vip("multipart/digest");
        AbstractC1266e.vip("multipart/parallel");
        purchase = AbstractC1266e.vip("multipart/form-data");
        billing = new byte[]{58, 32};
        yandex = new byte[]{13, 10};
        startapp = new byte[]{45, 45};
    }

    public C1402e(C0193e c0193e, C14133e c14133e, List list) {
        this.vip = c0193e;
        this.metrica = list;
        C10445e c10445e = C14133e.license;
        this.license = AbstractC1266e.vip(c14133e + "; boundary=" + c0193e.remoteconfig());
        this.appmetrica = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long advert(InterfaceC11855e interfaceC11855e, boolean z) {
        C16151e c16151e;
        InterfaceC11855e interfaceC11855e2;
        if (z) {
            Object obj = new Object();
            c16151e = obj;
            interfaceC11855e2 = obj;
        } else {
            c16151e = null;
            interfaceC11855e2 = interfaceC11855e;
        }
        List list = this.metrica;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            C0193e c0193e = this.vip;
            byte[] bArr = startapp;
            byte[] bArr2 = yandex;
            if (i >= size) {
                interfaceC11855e2.write(bArr);
                interfaceC11855e2.applovin(c0193e);
                interfaceC11855e2.write(bArr);
                interfaceC11855e2.write(bArr2);
                if (!z) {
                    return j;
                }
                long j2 = j + c16151e.f31731e;
                c16151e.ad();
                return j2;
            }
            C8295e c8295e = (C8295e) list.get(i);
            C15793e c15793e = c8295e.ad;
            C12190e c12190e = c8295e.vip;
            C12190e c12190e2 = (C12190e) c12190e.metrica;
            interfaceC11855e2.write(bArr);
            interfaceC11855e2.applovin(c0193e);
            interfaceC11855e2.write(bArr2);
            int size2 = c15793e.size();
            for (int i2 = 0; i2 < size2; i2++) {
                interfaceC11855e2.mo2631private(c15793e.billing(i2)).write(billing).mo2631private(c15793e.adcel(i2)).write(bArr2);
            }
            C14133e c14133e = (C14133e) c12190e2.metrica;
            if (c14133e != null) {
                interfaceC11855e2.mo2631private("Content-Type: ").mo2631private(c14133e.ad).write(bArr2);
            }
            long metrica = c12190e2.metrica();
            if (metrica == -1 && z) {
                c16151e.ad();
                return -1L;
            }
            interfaceC11855e2.write(bArr2);
            if (z) {
                j += metrica;
            } else {
                c12190e.mopub(interfaceC11855e2);
            }
            interfaceC11855e2.write(bArr2);
            i++;
        }
    }

    @Override // defpackage.AbstractC1101e
    public final C14133e license() {
        return this.license;
    }

    @Override // defpackage.AbstractC1101e
    public final long metrica() {
        long j = this.appmetrica;
        if (j != -1) {
            return j;
        }
        long advert = advert(null, true);
        this.appmetrica = advert;
        return advert;
    }

    @Override // defpackage.AbstractC1101e
    public final void mopub(InterfaceC11855e interfaceC11855e) {
        advert(interfaceC11855e, false);
    }

    @Override // defpackage.AbstractC1101e
    public final boolean yandex() {
        List list = this.metrica;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12190e c12190e = ((C8295e) it.next()).vip;
        }
        return false;
    }
}
