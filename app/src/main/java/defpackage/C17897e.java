package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٝۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17897e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f35140e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35141e;

    public /* synthetic */ C17897e(int i, Function0 function0) {
        this.f35141e = i;
        this.f35140e = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35141e) {
            case 0:
                ((C10122e) obj).metrica(((Number) this.f35140e.invoke()).floatValue());
                return Unit.INSTANCE;
            case 1:
                ((C10122e) obj).metrica(((Number) this.f35140e.invoke()).floatValue());
                return Unit.INSTANCE;
            case 2:
                return this.f35140e.invoke();
            case 3:
                AbstractC4653e.subscription((InterfaceC2235e) obj, ((C3618e) this.f35140e.invoke()).ad, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.INSTANCE;
            case 4:
                this.f35140e.invoke();
                return Unit.INSTANCE;
            case 5:
                this.f35140e.invoke();
                return Unit.INSTANCE;
            case 6:
                ((Boolean) obj).booleanValue();
                this.f35140e.invoke();
                return Unit.INSTANCE;
            case 7:
                ((Boolean) obj).booleanValue();
                this.f35140e.invoke();
                return Unit.INSTANCE;
            case 8:
                ((Boolean) obj).booleanValue();
                this.f35140e.invoke();
                return Unit.INSTANCE;
            case 9:
                InterfaceC15671e interfaceC15671e = (InterfaceC15671e) obj;
                Object invoke = this.f35140e.invoke();
                if (Float.isNaN(((Number) invoke).floatValue())) {
                    invoke = null;
                }
                Float f = (Float) invoke;
                AbstractC14594e.mopub(interfaceC15671e, new C0196e(f != null ? f.floatValue() : 0.0f, new C3721e(0.0f, 1.0f), 0));
                return Unit.INSTANCE;
            case 10:
                this.f35140e.invoke();
                return Unit.INSTANCE;
            case 11:
                return (C2152e) this.f35140e.invoke();
            case 12:
                return this.f35140e.invoke();
            case 13:
                if (((EnumC16488e) obj).vip()) {
                    this.f35140e.invoke();
                }
                return Unit.INSTANCE;
            case 14:
                return (C2152e) this.f35140e.invoke();
            default:
                InterfaceC15671e interfaceC15671e2 = (InterfaceC15671e) obj;
                Object invoke2 = this.f35140e.invoke();
                if (Float.isNaN(((Number) invoke2).floatValue())) {
                    invoke2 = null;
                }
                Float f2 = (Float) invoke2;
                float floatValue = f2 != null ? f2.floatValue() : 0.0f;
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                }
                AbstractC14594e.mopub(interfaceC15671e2, new C0196e(floatValue, new C3721e(0.0f, 1.0f), 0));
                return Unit.INSTANCE;
        }
    }
}
