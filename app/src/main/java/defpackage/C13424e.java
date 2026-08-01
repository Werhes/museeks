package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13424e extends AbstractC16634e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final InterfaceC5307e f26687e;

    public C13424e(InterfaceC5307e interfaceC5307e) {
        this.f26687e = interfaceC5307e;
    }

    public final void inmobi(C4834e c4834e, C13770e c13770e, int i) {
        c13770e.m3671package(571439452);
        int i2 = (c13770e.purchase(c4834e) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(594486711, new C1645e(c4834e, this), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1645e(this, c4834e, i);
        }
    }

    public final String isPro() {
        InterfaceC5307e interfaceC5307e = this.f26687e;
        if (interfaceC5307e instanceof C10702e) {
            C11519e c11519e = C11519e.f23146e;
            AudioPlaylist audioPlaylist = ((C10702e) interfaceC5307e).ad;
            c11519e.getClass();
            return "https://" + AbstractC7205e.metrica + "/music/playlist/" + AbstractC13406e.pro(audioPlaylist);
        }
        if (!(interfaceC5307e instanceof C5175e)) {
            if (!(interfaceC5307e instanceof C12721e)) {
                throw new C14803e(10);
            }
            C11519e c11519e2 = C11519e.f23146e;
            CatalogArtist catalogArtist = ((C12721e) interfaceC5307e).ad;
            c11519e2.getClass();
            return C11519e.appmetrica(catalogArtist);
        }
        C11519e c11519e3 = C11519e.f23146e;
        AudioTrack audioTrack = ((C5175e) interfaceC5307e).ad;
        c11519e3.getClass();
        return "https://" + AbstractC7205e.metrica + "/audio" + AbstractC6914e.purchase(audioTrack);
    }

    @Override // defpackage.AbstractC16634e
    public final Object isVip(C5435e c5435e) {
        return new C4834e(c5435e, new C10981e(1, this, C13424e.class, "onTargetPicked", "onTargetPicked(Lbruhcollective/itaysonlab/vkx/decompose/components/share/ShareTarget;)V", 0, 0, 3), new C6317e(0, this, C13424e.class, "dismiss", "dismiss()V", 0, 0, 5));
    }

    @Override // defpackage.AbstractC16634e
    public final /* bridge */ /* synthetic */ void tapsense(Object obj, C13770e c13770e) {
        inmobi((C4834e) obj, c13770e, 0);
    }
}
