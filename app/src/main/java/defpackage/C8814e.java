package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8814e extends AbstractC6690e {
    public static final C8814e billing;
    public static final Object yandex;
    public final AbstractC17475e appmetrica;
    public final C8740e purchase;

    static {
        C2171e c2171e = AbstractC17475e.f34223e;
        billing = new C8814e(C1410e.f4222e, null);
        yandex = new Object();
    }

    public C8814e(AbstractC17475e abstractC17475e, C8740e c8740e) {
        this.appmetrica = abstractC17475e;
        this.purchase = c8740e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eّۗؐ, eْٗۤ] */
    public final C8814e admob(int i, List list) {
        ?? abstractC12670e = new AbstractC12670e(4);
        AbstractC17475e abstractC17475e = this.appmetrica;
        abstractC12670e.license(abstractC17475e.subList(0, i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            abstractC12670e.metrica(new C8740e((C1962e) list.get(i2), -1L, -9223372036854775807L));
        }
        abstractC12670e.license(abstractC17475e.subList(i, abstractC17475e.size()));
        return new C8814e(abstractC12670e.billing(), this.purchase);
    }

    @Override // defpackage.AbstractC6690e
    public final Object advert(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC6690e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8814e)) {
            return false;
        }
        C8814e c8814e = (C8814e) obj;
        return Objects.equals(this.appmetrica, c8814e.appmetrica) && Objects.equals(this.purchase, c8814e.purchase);
    }

    @Override // defpackage.AbstractC6690e
    public final int hashCode() {
        return Objects.hash(this.appmetrica, this.purchase);
    }

    @Override // defpackage.AbstractC6690e
    public final int loadAd() {
        return this.appmetrica.size() + (this.purchase == null ? 0 : 1);
    }

    @Override // defpackage.AbstractC6690e
    public final C6158e purchase(int i, C6158e c6158e, boolean z) {
        C8740e remoteconfig = remoteconfig(i);
        Long valueOf = Long.valueOf(remoteconfig.vip);
        long m2546case = AbstractC9413e.m2546case(remoteconfig.metrica);
        c6158e.getClass();
        c6158e.startapp(valueOf, null, i, m2546case, 0L, C11541e.purchase, false);
        return c6158e;
    }

    public final C8740e remoteconfig(int i) {
        C8740e c8740e;
        AbstractC17475e abstractC17475e = this.appmetrica;
        return (i != abstractC17475e.size() || (c8740e = this.purchase) == null) ? (C8740e) abstractC17475e.get(i) : c8740e;
    }

    @Override // defpackage.AbstractC6690e
    public final C11501e smaato(int i, C11501e c11501e, long j) {
        C8740e remoteconfig = remoteconfig(i);
        c11501e.vip(yandex, remoteconfig.ad, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, AbstractC9413e.m2546case(remoteconfig.metrica), i, i, 0L);
        return c11501e;
    }

    public final long subscription(int i) {
        if (i < 0) {
            return -1L;
        }
        AbstractC17475e abstractC17475e = this.appmetrica;
        if (i < abstractC17475e.size()) {
            return ((C8740e) abstractC17475e.get(i)).vip;
        }
        return -1L;
    }

    @Override // defpackage.AbstractC6690e
    public final int vip(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC6690e
    public final int yandex() {
        return loadAd();
    }
}
