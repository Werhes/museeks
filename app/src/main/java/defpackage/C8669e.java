package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8669e extends AbstractC3317e {
    public InterfaceC4407e Signature;
    public final C16975e adcel;
    public final C5401e advert;
    public final C7635e amazon;
    public final C1962e loadAd;
    public final long mopub = -9223372036854775807L;
    public final boolean smaato = true;
    public final InterfaceC15169e startapp;
    public final C2435e yandex;

    /* JADX WARN: Type inference failed for: r4v1, types: [eٌّؒ, eٔؐۜ] */
    public C8669e(C15875e c15875e, InterfaceC15169e interfaceC15169e, C5401e c5401e) {
        C16914e c16914e;
        this.startapp = interfaceC15169e;
        this.advert = c5401e;
        boolean z = true;
        C9466e c9466e = new C9466e();
        C3560e c3560e = new C3560e();
        List list = Collections.EMPTY_LIST;
        C1410e c1410e = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        Uri uri = Uri.EMPTY;
        String uri2 = c15875e.ad.toString();
        uri2.getClass();
        AbstractC17475e remoteconfig = AbstractC17475e.remoteconfig(AbstractC17475e.ads(c15875e));
        if (((Uri) c3560e.appmetrica) != null && ((UUID) c3560e.license) == null) {
            z = false;
        }
        AbstractC2301e.subscription(z);
        if (uri != null) {
            c16914e = new C16914e(uri, null, ((UUID) c3560e.license) != null ? new C8369e(c3560e) : null, null, list, null, remoteconfig, null, -9223372036854775807L);
        } else {
            c16914e = null;
        }
        C1962e c1962e = new C1962e(uri2, new C14435e(c9466e), c16914e, new C15197e(c9457e), C12053e.f24142throw, c13325e);
        this.loadAd = c1962e;
        C11445e c11445e = new C11445e();
        String str = c15875e.vip;
        c11445e.amazon = AbstractC8542e.amazon(str == null ? "text/x-unknown" : str);
        c11445e.license = c15875e.metrica;
        c11445e.appmetrica = c15875e.license;
        c11445e.purchase = c15875e.appmetrica;
        c11445e.vip = c15875e.purchase;
        String str2 = c15875e.billing;
        c11445e.ad = str2 != null ? str2 : null;
        this.adcel = new C16975e(c11445e);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = c15875e.ad;
        AbstractC2301e.amazon(uri3, "The uri must be set.");
        this.yandex = new C2435e(uri3, 0L, 1, null, map, 0L, -1L, null, 1, null);
        this.amazon = new C7635e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, c1962e, null);
    }

    @Override // defpackage.AbstractC3317e
    public final void Signature() {
    }

    @Override // defpackage.AbstractC3317e
    public final void adcel() {
    }

    @Override // defpackage.AbstractC3317e
    public final void advert(InterfaceC4407e interfaceC4407e) {
        this.Signature = interfaceC4407e;
        smaato(this.amazon);
    }

    @Override // defpackage.AbstractC3317e
    public final void amazon(InterfaceC14239e interfaceC14239e) {
        ((C11740e) interfaceC14239e).f23617e.m4555switch(null);
    }

    @Override // defpackage.AbstractC3317e
    public final InterfaceC14239e vip(C18208e c18208e, InterfaceC16970e interfaceC16970e, long j) {
        return new C11740e(this.yandex, this.startapp, this.Signature, this.adcel, this.mopub, this.advert, new Csuper((CopyOnWriteArrayList) this.metrica.f36471e, 0, c18208e), this.smaato, null);
    }

    @Override // defpackage.AbstractC3317e
    public final C1962e yandex() {
        return this.loadAd;
    }
}
