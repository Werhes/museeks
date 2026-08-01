package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6282e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f13090e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13091e = 0;

    public /* synthetic */ C6282e(int i, Function1 function1) {
        this.f13090e = function1;
    }

    public /* synthetic */ C6282e(Function1 function1) {
        this.f13090e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13091e) {
            case 0:
                ((Integer) obj2).getClass();
                int advert = AbstractC5190e.advert(24583);
                AbstractC17181e.metrica(this.f13090e, (C13770e) obj, advert);
                return Unit.INSTANCE;
            default:
                this.f13090e.invoke(obj);
                return Unit.INSTANCE;
        }
    }
}
