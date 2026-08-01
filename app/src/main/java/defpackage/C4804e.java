package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: eُؗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4804e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C4246e f10235e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10236e;

    public /* synthetic */ C4804e(C4246e c4246e, int i) {
        this.f10236e = i;
        this.f10235e = c4246e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10236e) {
            case 0:
                Object obj = this.f10235e.f9318e;
                if (obj == null) {
                    return null;
                }
                return (C14377e) obj;
            default:
                C4246e c4246e = this.f10235e;
                InterfaceC10500e interfaceC10500e = (InterfaceC10500e) c4246e.f9318e;
                if (interfaceC10500e != null) {
                    interfaceC10500e.Signature(null);
                }
                c4246e.f9318e = null;
                return Unit.INSTANCE;
        }
    }
}
