package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17635e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34556e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C15820e f34557e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17635e(C15820e c15820e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f34556e = i;
        this.f34557e = c15820e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f34556e) {
            case 0:
                return new C17635e(this.f34557e, interfaceC5083e, 0);
            case 1:
                return new C17635e(this.f34557e, interfaceC5083e, 1);
            default:
                return new C17635e(this.f34557e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f34556e) {
            case 0:
                return ((C17635e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C17635e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C17635e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f34556e) {
            case 0:
                AbstractC2003e.purchase(obj);
                this.f34557e.mo1388instanceof();
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                C15820e c15820e = this.f34557e;
                AbstractC15615e.ad(new C1478e(0, c15820e.pro(), "Плейлист удален"));
                OriginalPlaylist originalPlaylist = c15820e.f31221e.f36501break;
                if (originalPlaylist != null) {
                    c15820e.f31206e = originalPlaylist.vip;
                    c15820e.f31213e = originalPlaylist.ad;
                    c15820e.f31212e = originalPlaylist.metrica;
                    c15820e.mo1388instanceof();
                } else {
                    c15820e.mo734case();
                }
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                this.f34557e.mo1388instanceof();
                return Unit.INSTANCE;
        }
    }
}
