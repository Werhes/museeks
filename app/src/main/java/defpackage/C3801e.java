package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: eؖؐٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3801e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8414e;

    public /* synthetic */ C3801e(int i) {
        this.f8414e = i;
    }

    public C3801e(C18214e c18214e) {
        this.f8414e = 0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.f8414e) {
            case 0:
                InterfaceC0390e interfaceC0390e = (InterfaceC0390e) obj;
                if (interfaceC0390e.mo334e() == 1) {
                    InterfaceC5052e interfaceC5052e = (InterfaceC5052e) interfaceC0390e.mo1351switch();
                    String str = C0696e.ad;
                    if (C0696e.adcel.containsKey(AbstractC14300e.purchase(interfaceC5052e))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                return ((C6391e) obj).vip.invoke();
            case 2:
                EnumC5778e.f12229e.get(((Number) obj).intValue());
                return null;
            case 3:
                EnumC4169e.f9187e.get(((Number) obj).intValue());
                return null;
            case 4:
                EnumC13413e.f26665e.get(((Number) obj).intValue());
                return null;
            case 5:
                EnumC2646e.f6520e.get(((Number) obj).intValue());
                return null;
            case 6:
                return (InterfaceC0390e) obj;
            case 7:
                return (InterfaceC0390e) obj;
            case 8:
                String concat = "java/util/".concat("Spliterator");
                C10796e c10796e = AbstractC1089e.vip;
                ((C0639e) obj).vip(concat, c10796e, c10796e);
                return Unit.INSTANCE;
            case 9:
                EnumC7437e.f15210e.get(((Number) obj).intValue());
                return null;
            case 10:
                if (((C12816e) obj) != null) {
                    return Boolean.valueOf(!r6.equals(AbstractC0206e.isPro));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
            default:
                EnumC7808e.f15819e.get(((Number) obj).intValue());
                return null;
        }
    }
}
