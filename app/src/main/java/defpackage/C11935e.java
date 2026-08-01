package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11935e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f23913e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f23914e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f23915e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f23916e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23917e;

    public /* synthetic */ C11935e(AbstractC10347e abstractC10347e, boolean z, int i, InterfaceC12864e interfaceC12864e, int i2, int i3) {
        this.f23917e = i3;
        this.f23916e = abstractC10347e;
        this.f23915e = z;
        this.f23914e = i;
        this.f23913e = interfaceC12864e;
    }

    public /* synthetic */ C11935e(AbstractC11110e abstractC11110e, boolean z, Function1 function1, int i) {
        this.f23917e = 1;
        this.f23916e = abstractC11110e;
        this.f23915e = z;
        this.f23913e = function1;
        this.f23914e = i;
    }

    public /* synthetic */ C11935e(C14873e c14873e, AudioTrack audioTrack, boolean z, int i, int i2) {
        this.f23917e = 2;
        this.f23916e = c14873e;
        this.f23913e = audioTrack;
        this.f23915e = z;
        this.f23914e = i;
    }

    public /* synthetic */ C11935e(boolean z, Function0 function0, Function0 function02, int i) {
        this.f23917e = 4;
        this.f23915e = z;
        this.f23916e = function0;
        this.f23913e = function02;
        this.f23914e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23917e) {
            case 0:
                ((Integer) obj2).getClass();
                int advert = AbstractC5190e.advert(385);
                ((C15052e) this.f23916e).m3909private(this.f23915e, this.f23914e, (InterfaceC12864e) this.f23913e, (C13770e) obj, advert);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int advert2 = AbstractC5190e.advert(this.f23914e | 1);
                AbstractC4465e.ad((AbstractC11110e) this.f23916e, this.f23915e, (Function1) this.f23913e, (C13770e) obj, advert2);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int advert3 = AbstractC5190e.advert(1);
                ((C14873e) this.f23916e).m3877finally((AudioTrack) this.f23913e, this.f23915e, this.f23914e, (C13770e) obj, advert3);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int advert4 = AbstractC5190e.advert(1);
                ((C14564e) this.f23916e).m3826package(this.f23915e, this.f23914e, (InterfaceC12864e) this.f23913e, (C13770e) obj, advert4);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).intValue();
                int advert5 = AbstractC5190e.advert(this.f23914e | 1);
                AbstractC7890e.vip(this.f23915e, (Function0) this.f23916e, (Function0) this.f23913e, (C13770e) obj, advert5);
                return Unit.INSTANCE;
        }
    }
}
