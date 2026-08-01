package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.methods.audio.playlist.AudioCreatePlaylist$NewPlaylistResponse;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3958e = 1;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C13182e f3959e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f3960e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public AudioCreatePlaylist$NewPlaylistResponse f3961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261e(C13182e c13182e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f3959e = c13182e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261e(C13182e c13182e, AudioCreatePlaylist$NewPlaylistResponse audioCreatePlaylist$NewPlaylistResponse, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f3959e = c13182e;
        this.f3961e = audioCreatePlaylist$NewPlaylistResponse;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f3958e) {
            case 0:
                return new C1261e(this.f3959e, this.f3961e, interfaceC5083e);
            default:
                return new C1261e(this.f3959e, interfaceC5083e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f3958e) {
            case 0:
                return ((C1261e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C1261e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1261e.loadAd(java.lang.Object):java.lang.Object");
    }
}
