package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2454e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6271e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f6272e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f6273e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f6274e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f6275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2454e(long j, C13135e c13135e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f6271e = 1;
        this.f6274e = j;
        this.f6273e = c13135e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2454e(C4498e c4498e, long j, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f6271e = 2;
        this.f6273e = c4498e;
        this.f6274e = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2454e(C17280e c17280e, Function1 function1, long j, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f6271e = 5;
        this.f6272e = c17280e;
        this.f6273e = (AbstractC7185e) function1;
        this.f6274e = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2454e(Object obj, long j, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f6271e = i;
        this.f6272e = obj;
        this.f6274e = j;
        this.f6273e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2454e(AudioPlaylist audioPlaylist, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f6271e = 0;
        this.f6273e = audioPlaylist;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [eؚٖؓ, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f6271e) {
            case 0:
                return new C2454e((AudioPlaylist) this.f6273e, interfaceC5083e);
            case 1:
                C2454e c2454e = new C2454e(this.f6274e, (C13135e) this.f6273e, interfaceC5083e);
                c2454e.f6272e = obj;
                return c2454e;
            case 2:
                C2454e c2454e2 = new C2454e((C4498e) this.f6273e, this.f6274e, interfaceC5083e);
                c2454e2.f6272e = obj;
                return c2454e2;
            case 3:
                return new C2454e((C14137e) this.f6272e, this.f6274e, (C11467e) this.f6273e, interfaceC5083e, 3);
            case 4:
                return new C2454e((C6534e) this.f6272e, this.f6274e, (C9839e) this.f6273e, interfaceC5083e, 4);
            default:
                return new C2454e((C17280e) this.f6272e, (AbstractC7185e) this.f6273e, this.f6274e, interfaceC5083e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f6271e) {
            case 0:
                return ((C2454e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C2454e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C2454e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C2454e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C2454e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C2454e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01be  */
    /* JADX WARN: Type inference failed for: r2v10, types: [eؚٖؓ, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01b3 -> B:73:0x01b6). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2454e.loadAd(java.lang.Object):java.lang.Object");
    }
}
