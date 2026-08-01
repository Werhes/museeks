package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC10470e implements View.OnClickListener {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f20677e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f20678e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5604e f20679e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f20680e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20681e;

    public /* synthetic */ ViewOnClickListenerC10470e(AbstractC5604e abstractC5604e, Object obj, Object obj2, Object obj3, int i) {
        this.f20681e = i;
        this.f20679e = abstractC5604e;
        this.f20678e = obj;
        this.f20680e = obj2;
        this.f20677e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20681e) {
            case 0:
                C1875e c1875e = (C1875e) this.f20679e;
                C0714e c0714e = (C0714e) this.f20678e;
                AbstractC16519e.ad(c1875e, c0714e.f3005e.getContext(), false, new C1247e((C9302e) this.f20680e, (CatalogArtist) this.f20677e, c1875e, c0714e, null, 8));
                return;
            default:
                C11268e c11268e = (C11268e) this.f20679e;
                AudioTrack audioTrack = (AudioTrack) this.f20678e;
                C5272e c5272e = (C5272e) this.f20680e;
                InterfaceC10283e interfaceC10283e = (InterfaceC10283e) this.f20677e;
                C12344e c12344e = c11268e.f22632e;
                InterfaceC1686e interfaceC1686e = c11268e.f22636e;
                InterfaceC5083e interfaceC5083e = null;
                if (c12344e != null && c12344e.f24750e) {
                    c12344e.applovin(audioTrack, c5272e.metrica());
                    c11268e.f590e.license(c5272e.metrica(), 1, null);
                    return;
                }
                if (AbstractC6914e.appmetrica(audioTrack)) {
                    new C7335e(new C4877e(audioTrack), c11268e.f22639e != 5 ? 2 : 1).signatures((AppActivity) interfaceC10283e.getRoot().getContext());
                    return;
                }
                InterfaceC8370e interfaceC8370e = c11268e.f22637e;
                if (interfaceC8370e != null && (interfaceC1686e instanceof C17922e)) {
                    interfaceC8370e.Signature(c5272e.metrica(), ((C17922e) interfaceC1686e).appmetrica, c11268e.f11959e.purchase);
                    return;
                }
                Function1 function1 = c11268e.f22635e;
                if (function1 != null) {
                    function1.invoke(audioTrack);
                    return;
                } else {
                    AbstractC16519e.vip((AppActivity) interfaceC10283e.getRoot().getContext(), new C7195e(c11268e, c5272e, interfaceC5083e, 11));
                    return;
                }
        }
    }
}
