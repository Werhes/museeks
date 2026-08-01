package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3468e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7016e f7715e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7716e = 1;

    public /* synthetic */ C3468e(C7016e c7016e) {
        this.f7715e = c7016e;
    }

    public /* synthetic */ C3468e(C15074e c15074e, C7016e c7016e) {
        this.f7715e = c7016e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7716e) {
            case 0:
                return Boolean.valueOf(this.f7715e == null || ((C16106e) obj).metrica.purchase() < 0.0f);
            default:
                ((Long) obj).longValue();
                Iterator it = this.f7715e.f14361e.appmetrica.iterator();
                while (true) {
                    C5243e c5243e = (C5243e) it;
                    if (!c5243e.hasNext()) {
                        return Unit.INSTANCE;
                    }
                    AbstractC12640e.advert(((C1451e) c5243e.next()).f4286e);
                }
        }
    }
}
