package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٚۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17105e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f33461e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f33462e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33463e;

    public /* synthetic */ C17105e(Function0 function0, Function0 function02, int i) {
        this.f33463e = i;
        this.f33462e = function0;
        this.f33461e = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC10601e interfaceC10601e = (InterfaceC10601e) obj;
        switch (this.f33463e) {
            case 0:
                this.f33462e.invoke();
                Function0 function0 = this.f33461e;
                if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : true) {
                    interfaceC10601e.close();
                }
                return Unit.INSTANCE;
            default:
                this.f33462e.invoke();
                Function0 function02 = this.f33461e;
                if (function02 != null ? ((Boolean) function02.invoke()).booleanValue() : true) {
                    interfaceC10601e.close();
                }
                return Unit.INSTANCE;
        }
    }
}
