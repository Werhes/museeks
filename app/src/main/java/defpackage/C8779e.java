package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8779e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f17682e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f17683e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17684e;

    public /* synthetic */ C8779e(int i, Object obj, int i2) {
        this.f17684e = i2;
        this.f17683e = i;
        this.f17682e = obj;
    }

    public /* synthetic */ C8779e(Object obj, int i, int i2) {
        this.f17684e = i2;
        this.f17682e = obj;
        this.f17683e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17684e) {
            case 0:
                ((C15052e) this.f17682e).m2514goto(new C6267e(this.f17683e > 0));
                return Unit.INSTANCE;
            case 1:
                C16330e c16330e = ((C10685e) this.f17682e).f21046e;
                int i = this.f17683e;
                c16330e.startapp(i);
                C7947e.ad.getClass();
                C17974e c17974e = C7947e.appmetrica;
                InterfaceC8614e interfaceC8614e = C7947e.vip[0];
                Integer valueOf = Integer.valueOf(i);
                c17974e.getClass();
                ((SharedPreferences) c17974e.f35233e).edit().putInt("startup_index", valueOf.intValue()).apply();
                return Unit.INSTANCE;
            case 2:
                ((C17954e) this.f17682e).purchase.invoke(Integer.valueOf(this.f17683e));
                return Unit.INSTANCE;
            case 3:
                return new C16349e(this.f17683e, 0.0f, (Function0) this.f17682e);
            case 4:
                C14564e c14564e = (C14564e) this.f17682e;
                int i2 = this.f17683e * 60;
                C11908e.appmetrica = true;
                C11908e.vip = i2;
                C11908e.license = i2;
                c14564e.m3830synchronized(i2);
                return Unit.INSTANCE;
            case 5:
                return new C16341e(Integer.valueOf(this.f17683e), (String) this.f17682e);
            case 6:
                ((C16330e) this.f17682e).startapp(this.f17683e);
                return Unit.INSTANCE;
            case 7:
                return Integer.valueOf(((C4395e) this.f17682e).purchase.vip.license(this.f17683e));
            case 8:
                C11188e c11188e = (C11188e) this.f17682e;
                EnumC2502e enumC2502e = (EnumC2502e) EnumC2502e.f6350e.get(this.f17683e);
                c11188e.f22451e.advert(enumC2502e);
                C5775e.ad.getClass();
                C5775e.mopub.vip(enumC2502e);
                return Unit.INSTANCE;
            default:
                ((Function1) this.f17682e).invoke(Integer.valueOf(this.f17683e));
                return Unit.INSTANCE;
        }
    }
}
