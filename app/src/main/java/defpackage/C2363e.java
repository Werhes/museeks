package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2363e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f5916e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f5917e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public ArrayList f5918e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f5919e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f5920e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f5921e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public AudioPlaylist f5922e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ String f5923e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ int f5924e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f5925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2363e(InterfaceC5083e interfaceC5083e, int i, int i2, String str, Function1 function1) {
        super(2, interfaceC5083e);
        this.f5924e = i;
        this.f5921e = i2;
        this.f5923e = str;
        this.f5919e = function1;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C2363e c2363e = new C2363e(interfaceC5083e, this.f5924e, this.f5921e, this.f5923e, this.f5919e);
        c2363e.f5925e = obj;
        return c2363e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2363e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:5:0x0053). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f5925e
            eۡۦ r0 = (defpackage.InterfaceC18435e) r0
            int r0 = r11.f5916e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L20
            if (r0 != r1) goto L18
            int r0 = r11.f5920e
            int r3 = r11.f5917e
            java.util.ArrayList r4 = r11.f5918e
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r5 = r11.f5922e
            defpackage.AbstractC2003e.purchase(r12)
            goto L53
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            defpackage.AbstractC2003e.purchase(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0 = 0
            r5 = r0
            r10 = r2
        L2b:
            eْؕؖ r3 = new eْؕؖ
            int r4 = r11.f5924e
            long r7 = (long) r4
            java.lang.String r9 = r11.f5923e
            r6 = 120(0x78, float:1.68E-43)
            int r4 = r11.f5921e
            r3.<init>(r4, r5, r6, r7, r9)
            r11.f5925e = r2
            r11.f5922e = r10
            r11.f5918e = r12
            r11.f5917e = r0
            r11.f5920e = r5
            r11.f5916e = r1
            java.lang.Object r3 = defpackage.AbstractC18406e.yandex(r3, r11)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r3 != r4) goto L4e
            return r4
        L4e:
            r4 = r12
            r12 = r3
            r3 = r0
            r0 = r5
            r5 = r10
        L53:
            ua.itaysonlab.vkapi2.methods.audio.playlist.AudioGetPlaylist$PlaylistResponse r12 = (ua.itaysonlab.vkapi2.methods.audio.playlist.AudioGetPlaylist$PlaylistResponse) r12
            if (r0 != 0) goto L59
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r5 = r12.vip
        L59:
            r10 = r5
            java.util.List r5 = r12.metrica
            r4.addAll(r5)
            int r5 = r0 + 120
            java.util.List r12 = r12.metrica
            int r12 = r12.size()
            r0 = 120(0x78, float:1.68E-43)
            if (r12 >= r0) goto L78
            eؙۖؕ r12 = new eؙۖؕ
            r12.<init>(r10, r4)
            kotlin.jvm.functions.Function1 r0 = r11.f5919e
            r0.invoke(r12)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L78:
            r0 = r3
            r12 = r4
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2363e.loadAd(java.lang.Object):java.lang.Object");
    }
}
