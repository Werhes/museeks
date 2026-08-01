package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4982e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f10549e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f10550e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f10551e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f10552e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f10553e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10554e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f10555e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f10556e;

    public /* synthetic */ C4982e(int i, InterfaceC12864e interfaceC12864e, String str, String str2, String str3, Function0 function0, boolean z) {
        this.f10549e = str;
        this.f10556e = str2;
        this.f10555e = str3;
        this.f10552e = function0;
        this.f10551e = z;
        this.f10550e = interfaceC12864e;
        this.f10553e = i;
    }

    public /* synthetic */ C4982e(String str, boolean z, C12776e c12776e, InterfaceC12864e interfaceC12864e, Function3 function3, Function0 function0, int i) {
        this.f10549e = str;
        this.f10551e = z;
        this.f10556e = c12776e;
        this.f10550e = interfaceC12864e;
        this.f10555e = function3;
        this.f10552e = function0;
        this.f10553e = i;
    }

    public /* synthetic */ C4982e(Function0 function0, InterfaceC12864e interfaceC12864e, boolean z, InterfaceC16154e interfaceC16154e, C14602e c14602e, C2892e c2892e, int i) {
        this.f10552e = function0;
        this.f10550e = interfaceC12864e;
        this.f10551e = z;
        this.f10549e = interfaceC16154e;
        this.f10556e = c14602e;
        this.f10555e = c2892e;
        this.f10553e = i;
    }

    public /* synthetic */ C4982e(boolean z, EnumC9470e enumC9470e, InterfaceC12864e interfaceC12864e, C4835e c4835e, C13121e c13121e, C13121e c13121e2, int i) {
        this.f10551e = z;
        this.f10549e = enumC9470e;
        this.f10550e = interfaceC12864e;
        this.f10556e = c4835e;
        this.f10555e = c13121e;
        this.f10552e = c13121e2;
        this.f10553e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10554e) {
            case 0:
                String str = (String) this.f10549e;
                String str2 = (String) this.f10556e;
                String str3 = (String) this.f10555e;
                Function0 function0 = (Function0) this.f10552e;
                ((Integer) obj2).getClass();
                AbstractC16279e.metrica(AbstractC5190e.advert(this.f10553e | 1), (C13770e) obj, this.f10550e, str, str2, str3, function0, this.f10551e);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC2705e.vip(this.f10551e, (EnumC9470e) this.f10549e, this.f10550e, (C4835e) this.f10556e, (C13121e) this.f10555e, (C13121e) this.f10552e, (C13770e) obj, AbstractC5190e.advert(this.f10553e | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC3435e.metrica((String) this.f10549e, this.f10551e, (C12776e) this.f10556e, this.f10550e, (Function3) this.f10555e, (Function0) this.f10552e, (C13770e) obj, AbstractC5190e.advert(this.f10553e | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC0014e.appmetrica((Function0) this.f10552e, this.f10550e, this.f10551e, (InterfaceC16154e) this.f10549e, (C14602e) this.f10556e, (C2892e) this.f10555e, (C13770e) obj, AbstractC5190e.advert(this.f10553e | 1));
                return Unit.INSTANCE;
        }
    }
}
