package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C12996e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Cpackage f25914e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25915e;

    public /* synthetic */ C12996e(Cpackage cpackage, int i) {
        this.f25915e = i;
        this.f25914e = cpackage;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        List list = (List) obj2;
        switch (this.f25915e) {
            case 0:
                this.f25914e.mo858e(str, list);
                return Unit.INSTANCE;
            default:
                this.f25914e.m4629e(str, list);
                return Unit.INSTANCE;
        }
    }
}
