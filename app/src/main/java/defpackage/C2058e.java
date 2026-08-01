package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2058e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f5354e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5355e;

    public /* synthetic */ C2058e(int i, Object obj) {
        this.f5355e = i;
        this.f5354e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f5355e;
        Object obj2 = this.f5354e;
        switch (i) {
            case 0:
                ((C9438e) obj2).license = null;
                return Unit.INSTANCE;
            case 1:
                return ((C7838e) ((C1439e) obj2).vip.get()).f15868e.adcel((String) obj);
            case 2:
                C5114e c5114e = (C5114e) obj;
                c5114e.m1759e(c5114e.m1758e(AbstractC3820e.ad.vip(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{AbstractC6914e.billing((AudioTrack) obj2)}, 1)).metrica());
                return Boolean.TRUE;
            default:
                C2243e c2243e = (C2243e) obj2;
                long longValue = ((Long) obj).longValue();
                AbstractC14966e.metrica(c2243e.license, new C2091e(28));
                AbstractC5336e.purchase(c2243e.vip, null, 0, new C7977e(longValue, c2243e, (InterfaceC5083e) null, 7), 3);
                return Unit.INSTANCE;
        }
    }
}
