package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5668e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f12042e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ String f12043e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C18128e f12044e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ long f12045e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f12046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5668e(int i, long j, String str, C18128e c18128e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f12046e = i;
        this.f12045e = j;
        this.f12043e = str;
        this.f12044e = c18128e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C5668e(this.f12046e, this.f12045e, this.f12043e, this.f12044e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5668e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (defpackage.AbstractC5336e.advert(r0, r3, r13) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r14 == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        if (r6.subscription(r13) == r5) goto L28;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f12042e
            e٘ۥٟ r1 = r13.f12044e
            r2 = 3
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L25
            if (r0 == r4) goto L21
            if (r0 == r3) goto L1d
            if (r0 != r2) goto L15
            defpackage.AbstractC2003e.purchase(r14)
            goto L7e
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            defpackage.AbstractC2003e.purchase(r14)
            goto L54
        L21:
            defpackage.AbstractC2003e.purchase(r14)
            goto L3e
        L25:
            defpackage.AbstractC2003e.purchase(r14)
            eْؕؖ r6 = new eْؕؖ
            java.lang.String r10 = r13.f12043e
            java.util.List r11 = r1.f35536e
            int r7 = r13.f12046e
            long r8 = r13.f12045e
            r6.<init>(r7, r8, r10, r11)
            r13.f12042e = r4
            java.lang.Object r14 = r6.subscription(r13)
            if (r14 != r5) goto L3e
            goto L7d
        L3e:
            eْؕؖ r6 = new eْؕؖ
            r8 = 0
            r9 = 1
            int r7 = r13.f12046e
            long r10 = r13.f12045e
            java.lang.String r12 = r13.f12043e
            r6.<init>(r7, r8, r9, r10, r12)
            r13.f12042e = r3
            java.lang.Object r14 = defpackage.AbstractC18406e.yandex(r6, r13)
            if (r14 != r5) goto L54
            goto L7d
        L54:
            ua.itaysonlab.vkapi2.methods.audio.playlist.AudioGetPlaylist$PlaylistResponse r14 = (ua.itaysonlab.vkapi2.methods.audio.playlist.AudioGetPlaylist$PlaylistResponse) r14
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r14 = r14.vip
            if (r14 != 0) goto L5d
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L5d:
            eؙِؐ r0 = new eؙِؐ
            r0.<init>(r14)
            ua.itaysonlab.vkx.VKXApplication r3 = ua.itaysonlab.vkx.VKXApplication.f36528e
            r4 = 0
            if (r3 == 0) goto L68
            goto L69
        L68:
            r3 = r4
        L69:
            defpackage.AbstractC6232e.billing(r0, r3)
            eّٕٓ r0 = defpackage.AbstractC6731e.ad
            eْؐؔ r0 = defpackage.AbstractC1497e.ad
            eؘٖٖ r3 = new eؘٖٖ
            r3.<init>(r1, r14, r4)
            r13.f12042e = r2
            java.lang.Object r14 = defpackage.AbstractC5336e.advert(r0, r3, r13)
            if (r14 != r5) goto L7e
        L7d:
            return r5
        L7e:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5668e.loadAd(java.lang.Object):java.lang.Object");
    }
}
