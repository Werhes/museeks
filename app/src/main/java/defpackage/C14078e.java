package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14078e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f27833e = 5;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f27834e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f27835e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ Object f27836e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ boolean f27837e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f27838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14078e(InterfaceC3314e interfaceC3314e, boolean z, C15274e c15274e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27836e = interfaceC3314e;
        this.f27837e = z;
        this.f27834e = c15274e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14078e(C7558e c7558e, boolean z, InterfaceC2869e interfaceC2869e, Function0 function0, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27835e = c7558e;
        this.f27837e = z;
        this.f27836e = interfaceC2869e;
        this.f27834e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14078e(C7576e c7576e, C17637e c17637e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27836e = c7576e;
        this.f27834e = c17637e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14078e(C7838e c7838e, List list, boolean z, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27836e = c7838e;
        this.f27834e = list;
        this.f27837e = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14078e(boolean z, C0110e c0110e, InterfaceC6512e interfaceC6512e, C16446e c16446e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27837e = z;
        this.f27835e = c0110e;
        this.f27836e = interfaceC6512e;
        this.f27834e = c16446e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14078e(boolean z, AudioTrack audioTrack, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27837e = z;
        this.f27834e = audioTrack;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f27833e) {
            case 0:
                C14078e c14078e = new C14078e((C7576e) this.f27836e, (C17637e) this.f27834e, interfaceC5083e);
                c14078e.f27837e = ((Boolean) obj).booleanValue();
                return c14078e;
            case 1:
                return new C14078e(this.f27837e, (C0110e) this.f27835e, (InterfaceC6512e) this.f27836e, (C16446e) this.f27834e, interfaceC5083e);
            case 2:
                C14078e c14078e2 = new C14078e(this.f27837e, (AudioTrack) this.f27834e, interfaceC5083e);
                c14078e2.f27836e = obj;
                return c14078e2;
            case 3:
                C14078e c14078e3 = new C14078e((C7838e) this.f27836e, (List) this.f27834e, this.f27837e, interfaceC5083e);
                c14078e3.f27835e = obj;
                return c14078e3;
            case 4:
                return new C14078e((C7558e) this.f27835e, this.f27837e, (InterfaceC2869e) this.f27836e, (Function0) this.f27834e, interfaceC5083e);
            default:
                return new C14078e((InterfaceC3314e) this.f27836e, this.f27837e, (C15274e) this.f27834e, interfaceC5083e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27833e) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((C14078e) advert((InterfaceC5083e) obj2, bool)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C14078e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C14078e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C14078e) advert((InterfaceC5083e) obj2, (C12318e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C14078e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C14078e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:82:0x0185. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0257  */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14078e.loadAd(java.lang.Object):java.lang.Object");
    }
}
