package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؑۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1526e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f4398e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f4399e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4400e = 0;

    public /* synthetic */ C1526e(int i, int i2) {
        this.f4399e = i;
        this.f4398e = i2;
    }

    public /* synthetic */ C1526e(C10053e c10053e, int i, int i2) {
        this.f4399e = i;
        this.f4398e = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f4400e;
        int i2 = this.f4398e;
        int i3 = this.f4399e;
        switch (i) {
            case 0:
                float f = i3;
                if (i2 < 1) {
                    i2 = 1;
                }
                return Float.valueOf(f / i2);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append('_');
                sb.append(i3);
                String sb2 = sb.toString();
                C4199e m4502e = C18353e.vip.m4502e();
                CachedTrack cachedTrack = m4502e != null ? (CachedTrack) AbstractC18366e.metrica(m4502e.m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{sb2}, 1))) : null;
                if (cachedTrack != null) {
                    C11794e.f23667e.billing(cachedTrack.metrica());
                }
                return Unit.INSTANCE;
        }
    }
}
