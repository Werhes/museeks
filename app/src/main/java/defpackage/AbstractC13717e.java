package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؒٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13717e {
    public C11353e ad;
    public int license;
    public boolean metrica;
    public long vip;

    public AbstractC13717e(long j, C11353e c11353e) {
        int i;
        int numberOfTrailingZeros;
        this.ad = c11353e;
        this.vip = j;
        C7983e c7983e = AbstractC12909e.ad;
        if (j != 0) {
            C11353e license = license();
            long j2 = license.f22849e;
            long[] jArr = license.f22851e;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = license.f22850e;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = license.f22852e;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (AbstractC12909e.metrica) {
                i = AbstractC12909e.purchase.ad(j);
            }
        } else {
            i = -1;
        }
        this.license = i;
    }

    public static void admob(AbstractC13717e abstractC13717e) {
        AbstractC12909e.vip.Signature(abstractC13717e);
    }

    public void Signature() {
        loadAd();
    }

    public final void ad() {
        synchronized (AbstractC12909e.metrica) {
            vip();
            Signature();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final AbstractC13717e adcel() {
        C0912e c0912e = AbstractC12909e.vip;
        AbstractC13717e abstractC13717e = (AbstractC13717e) c0912e.get();
        c0912e.Signature(this);
        return abstractC13717e;
    }

    public abstract void advert();

    public abstract void amazon(InterfaceC17335e interfaceC17335e);

    public abstract Function1 appmetrica();

    public long billing() {
        return this.vip;
    }

    public C11353e license() {
        return this.ad;
    }

    public final void loadAd() {
        int i = this.license;
        if (i >= 0) {
            AbstractC12909e.tapsense(i);
            this.license = -1;
        }
    }

    public void metrica() {
        this.metrica = true;
        synchronized (AbstractC12909e.metrica) {
            loadAd();
            Unit unit = Unit.INSTANCE;
        }
    }

    public abstract void mopub();

    public void pro(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract boolean purchase();

    public void remoteconfig(long j) {
        this.vip = j;
    }

    public abstract AbstractC13717e signatures(Function1 function1);

    public abstract void smaato();

    public abstract Function1 startapp();

    public void subscription(C11353e c11353e) {
        this.ad = c11353e;
    }

    public void vip() {
        AbstractC12909e.license = AbstractC12909e.license.billing(billing());
    }

    public int yandex() {
        return 0;
    }
}
