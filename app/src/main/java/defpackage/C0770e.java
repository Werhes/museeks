package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؒؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3124e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f3125e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C2038e f3126e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0770e(C2038e c2038e, AudioTrack audioTrack, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f3124e = i;
        this.f3126e = c2038e;
        this.f3125e = audioTrack;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f3124e) {
            case 0:
                return new C0770e(this.f3126e, this.f3125e, interfaceC5083e, 0);
            default:
                return new C0770e(this.f3126e, this.f3125e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f3124e) {
            case 0:
                return ((C0770e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C0770e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f3124e) {
            case 0:
                AbstractC2003e.purchase(obj);
                AppActivity appActivity = this.f3126e.ad;
                List vip = AbstractC6914e.vip(this.f3125e);
                if (vip.isEmpty()) {
                    vip = null;
                }
                if (vip != null) {
                    AbstractC6100e.vip(appActivity, vip);
                }
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                C2038e c2038e = this.f3126e;
                c2038e.ad.firebase();
                AppActivity appActivity2 = c2038e.ad;
                AudioAlbum audioAlbum = this.f3125e.amazon;
                appActivity2.isVip(new C15820e(audioAlbum.ad.intValue(), 8, audioAlbum.vip.longValue(), audioAlbum != null ? audioAlbum.metrica : null));
                return Unit.INSTANCE;
        }
    }
}
