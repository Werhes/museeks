package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2193e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f5581e = 0;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Object f5582e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f5583e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Object f5584e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ boolean f5585e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f5586e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f5587e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2193e(C7576e c7576e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f5582e = c7576e;
        this.f5584e = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2193e(boolean z, AudioTrack audioTrack, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f5585e = z;
        this.f5584e = audioTrack;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f5581e) {
            case 0:
                C2193e c2193e = new C2193e((C7576e) this.f5582e, (Function2) this.f5584e, interfaceC5083e);
                c2193e.f5585e = ((Boolean) obj).booleanValue();
                return c2193e;
            default:
                C2193e c2193e2 = new C2193e(this.f5585e, (AudioTrack) this.f5584e, interfaceC5083e);
                c2193e2.f5583e = obj;
                return c2193e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5581e) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((C2193e) advert((InterfaceC5083e) obj2, bool)).loadAd(Unit.INSTANCE);
            default:
                return ((C2193e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010c A[Catch: all -> 0x0145, TryCatch #0 {all -> 0x0145, blocks: (B:10:0x0024, B:11:0x0143, B:16:0x002f, B:18:0x012c, B:23:0x003a, B:25:0x0106, B:27:0x010c, B:34:0x0125, B:36:0x0046, B:38:0x00ba, B:43:0x0051, B:44:0x0094, B:46:0x009a, B:53:0x00b2, B:56:0x0060, B:61:0x00d2), top: B:4:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a A[Catch: all -> 0x0145, TryCatch #0 {all -> 0x0145, blocks: (B:10:0x0024, B:11:0x0143, B:16:0x002f, B:18:0x012c, B:23:0x003a, B:25:0x0106, B:27:0x010c, B:34:0x0125, B:36:0x0046, B:38:0x00ba, B:43:0x0051, B:44:0x0094, B:46:0x009a, B:53:0x00b2, B:56:0x0060, B:61:0x00d2), top: B:4:0x0015 }] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2193e.loadAd(java.lang.Object):java.lang.Object");
    }
}
