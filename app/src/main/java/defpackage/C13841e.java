package defpackage;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13841e implements InterfaceC17718e {
    public final C14789e ad;
    public final boolean appmetrica;
    public final int license;
    public final int metrica;
    public final C9106e purchase;
    public final List vip;

    public C13841e(C14789e c14789e, List list, int i, int i2, boolean z, C9106e c9106e) {
        this.ad = c14789e;
        this.vip = list;
        this.metrica = i;
        this.license = i2;
        this.appmetrica = z;
        this.purchase = c9106e;
        if (list.size() > 1) {
            return;
        }
        AbstractC8889e.metrica("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static void amazon(C16529e c16529e, C9106e c9106e, C4395e c4395e, int i, int i2) {
        C9106e c9106e2;
        if (c9106e.metrica) {
            c9106e2 = new C9106e(c4395e.ad(i2), c4395e.ad(i), i2 > i);
        } else {
            c9106e2 = new C9106e(c4395e.ad(i), c4395e.ad(i2), i > i2);
        }
        if (i > i2) {
            AbstractC8889e.metrica("minOffset should be less than or equal to maxOffset: " + c9106e2);
        }
        long j = c4395e.ad;
        int metrica = c16529e.metrica(j);
        Object[] objArr = c16529e.metrica;
        Object obj = objArr[metrica];
        c16529e.vip[metrica] = j;
        objArr[metrica] = c9106e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int Signature(int i, boolean z) {
        int m2467class = AbstractC8703e.m2467class(yandex());
        int i2 = z;
        if (m2467class != 0) {
            if (m2467class != 1) {
                if (m2467class != 2) {
                    throw new C14803e(10);
                }
                i2 = 1;
            }
            return (i - (i2 ^ 1)) / 2;
        }
        if (z != 0) {
            i2 = 0;
            return (i - (i2 ^ 1)) / 2;
        }
        i2 = 1;
        return (i - (i2 ^ 1)) / 2;
    }

    @Override // defpackage.InterfaceC17718e
    public final boolean ad() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC17718e
    public final C4395e adcel() {
        return (C4395e) this.vip.get(Signature(this.metrica, true));
    }

    @Override // defpackage.InterfaceC17718e
    public final boolean advert(InterfaceC17718e interfaceC17718e) {
        if (this.purchase != null && interfaceC17718e != null && (interfaceC17718e instanceof C13841e)) {
            C13841e c13841e = (C13841e) interfaceC17718e;
            List list = c13841e.vip;
            if (this.appmetrica == c13841e.appmetrica && this.metrica == c13841e.metrica && this.license == c13841e.license) {
                List list2 = this.vip;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        C4395e c4395e = (C4395e) list2.get(i);
                        C4395e c4395e2 = (C4395e) list.get(i);
                        if (c4395e.ad != c4395e2.ad || c4395e.metrica != c4395e2.metrica || c4395e.license != c4395e2.license) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC17718e
    public final int appmetrica() {
        return this.vip.size();
    }

    @Override // defpackage.InterfaceC17718e
    public final C4395e billing() {
        return (C4395e) this.vip.get(Signature(this.license, false));
    }

    @Override // defpackage.InterfaceC17718e
    public final C4395e license() {
        return yandex() == 1 ? billing() : adcel();
    }

    public final int loadAd(long j) {
        try {
            return this.ad.metrica(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(AbstractC0869e.isVip(j, "Invalid selectableId: "), e);
        }
    }

    @Override // defpackage.InterfaceC17718e
    public final C9106e metrica() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC17718e
    public final int mopub() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC17718e
    public final int purchase() {
        return this.license;
    }

    @Override // defpackage.InterfaceC17718e
    public final C16529e smaato(C9106e c9106e) {
        C14980e c14980e = c9106e.ad;
        boolean z = c9106e.metrica;
        long j = c14980e.metrica;
        int i = c14980e.vip;
        C14980e c14980e2 = c9106e.vip;
        long j2 = c14980e2.metrica;
        int i2 = c14980e2.vip;
        if (j != j2) {
            C16529e c16529e = AbstractC2800e.ad;
            C16529e c16529e2 = new C16529e();
            amazon(c16529e2, c9106e, license(), (z ? c14980e2 : c14980e).vip, license().purchase.ad.ad.f20850e.length());
            startapp(new C10869e(this, c16529e2, c9106e));
            if (!z) {
                c14980e = c14980e2;
            }
            amazon(c16529e2, c9106e, yandex() == 1 ? adcel() : billing(), 0, c14980e.vip);
            return c16529e2;
        }
        if ((!z || i < i2) && (z || i > i2)) {
            AbstractC8889e.metrica("unexpectedly miss-crossed selection: " + c9106e);
        }
        long j3 = c14980e.metrica;
        C16529e c16529e3 = AbstractC2800e.ad;
        C16529e c16529e4 = new C16529e();
        c16529e4.yandex(j3, c9106e);
        return c16529e4;
    }

    @Override // defpackage.InterfaceC17718e
    public final void startapp(Function1 function1) {
        int loadAd = loadAd(license().ad);
        int loadAd2 = loadAd((yandex() == 1 ? adcel() : billing()).ad);
        int i = loadAd + 1;
        if (i >= loadAd2) {
            return;
        }
        while (i < loadAd2) {
            function1.invoke(this.vip.get(i));
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.appmetrica);
        sb.append(", startPosition=");
        boolean z = true;
        float f = 2;
        sb.append((this.metrica + 1) / f);
        sb.append(", endPosition=");
        sb.append((this.license + 1) / f);
        sb.append(", crossed=");
        sb.append(AbstractC13501e.ads(yandex()));
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.vip;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C4395e c4395e = (C4395e) list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(c4395e);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC17718e
    public final C4395e vip() {
        return this.appmetrica ? adcel() : billing();
    }

    @Override // defpackage.InterfaceC17718e
    public final int yandex() {
        int i = this.metrica;
        int i2 = this.license;
        if (i < i2) {
            return 2;
        }
        if (i > i2) {
            return 1;
        }
        return ((C4395e) this.vip.get(i / 2)).vip();
    }
}
