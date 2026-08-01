package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16242e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C18128e f31919e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AudioPlaylist f31920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16242e(C18128e c18128e, AudioPlaylist audioPlaylist, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f31919e = c18128e;
        this.f31920e = audioPlaylist;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C16242e(this.f31919e, this.f31920e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C16242e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        C18128e c18128e = this.f31919e;
        AppActivity appActivity = (AppActivity) c18128e.f10582e;
        VKXApplication.Companion companion = VKXApplication.f36531e;
        C9402e.ad(appActivity, new C15076e(new Integer(R.drawable.ic_list_add_outline_28), VKXApplication.Companion.vip(R.string.sn_track_added_to_playlist), this.f31920e.subs, null, null, 120));
        c18128e.purchase();
        return Unit.INSTANCE;
    }
}
