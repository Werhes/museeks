package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0967e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f3407e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f3408e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3409e;

    public /* synthetic */ C0967e(long j, Object obj, int i) {
        this.f3409e = i;
        this.f3408e = j;
        this.f3407e = obj;
    }

    public /* synthetic */ C0967e(Object obj, long j, int i) {
        this.f3409e = i;
        this.f3407e = obj;
        this.f3408e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f3409e;
        long j = this.f3408e;
        Object obj2 = this.f3407e;
        switch (i) {
            case 0:
                C0110e c0110e = (C0110e) obj2;
                long metrica = C11490e.metrica(((C11490e) ((C7558e) obj).license()).ad, j);
                int i2 = C0110e.pro;
                c0110e.yandex(metrica);
                c0110e.metrica.invoke();
                return Unit.INSTANCE;
            case 1:
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                float mo497instanceof = interfaceC2235e.mo497instanceof(8);
                float floatValue = ((Number) ((InterfaceC16132e) obj2).getValue()).floatValue();
                long j2 = this.f3408e;
                AbstractC4653e.pro(interfaceC2235e, C3618e.vip(0.12f, j2), 0L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits(mo497instanceof) & 4294967295L) | (Float.floatToRawIntBits(mo497instanceof) << 32), null, 242);
                AbstractC4653e.pro(interfaceC2235e, j2, 0L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)) * floatValue) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits(mo497instanceof) << 32) | (Float.floatToRawIntBits(mo497instanceof) & 4294967295L), null, 242);
                return Unit.INSTANCE;
            case 2:
                AbstractC4653e.subscription((InterfaceC2235e) obj, this.f3408e, 0L, 0L, AbstractC3062e.vip(((Number) ((Function0) obj2).invoke()).floatValue(), 0.0f, 1.0f), null, null, 0, 118);
                return Unit.INSTANCE;
            default:
                List list = (List) obj2;
                C5114e c5114e = (C5114e) obj;
                int i3 = 1;
                Object[] objArr = {Long.valueOf(j)};
                C12232e c12232e = AbstractC3820e.ad;
                CachedLibrary cachedLibrary = (CachedLibrary) AbstractC18366e.metrica(c5114e.m1758e(c12232e.vip(CachedLibrary.class), "uid == $0", Arrays.copyOf(objArr, 1)));
                if (cachedLibrary == null) {
                    cachedLibrary = new CachedLibrary();
                    cachedLibrary.metrica(j);
                }
                List m3577else = AbstractC13480e.m3577else(c5114e.m1758e(c12232e.vip(CachedTrack.class), "uid IN $0", Arrays.copyOf(new Object[]{list}, 1)).metrica(), new C8540e(i3, list));
                C5775e c5775e = C5775e.ad;
                c5775e.getClass();
                C12309e c12309e = C5775e.metrica;
                InterfaceC8614e interfaceC8614e = C5775e.vip[0];
                if (((Boolean) c12309e.tapsense(c5775e)).booleanValue()) {
                    cachedLibrary.ad().addAll(0, m3577else);
                } else {
                    cachedLibrary.ad().addAll(m3577else);
                }
                c5114e.m1757e(cachedLibrary);
                return Unit.INSTANCE;
        }
    }
}
