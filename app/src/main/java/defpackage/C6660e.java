package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۛۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6660e {
    public static final C6173e billing = new C6173e(3);
    public final Context ad;
    public final LinkedHashSet appmetrica;
    public final int license;
    public int metrica;
    public final Set purchase;
    public final LinkedHashMap vip;

    public C6660e(Context context, LinkedHashMap linkedHashMap, int i, int i2, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.ad = context;
        this.vip = linkedHashMap;
        this.metrica = i;
        this.license = i2;
        this.appmetrica = linkedHashSet;
        this.purchase = set;
    }

    public final int ad(AbstractC5918e abstractC5918e) {
        C14888e vip = AbstractC4306e.vip(this.ad, abstractC5918e);
        synchronized (this) {
            Integer num = (Integer) this.vip.get(vip);
            if (num != null) {
                int intValue = num.intValue();
                this.appmetrica.add(Integer.valueOf(intValue));
                return intValue;
            }
            int i = this.metrica;
            while (this.purchase.contains(Integer.valueOf(i))) {
                i = (i + 1) % AbstractC5111e.metrica;
                if (i == this.metrica) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.metrica = (i + 1) % AbstractC5111e.metrica;
            this.appmetrica.add(Integer.valueOf(i));
            this.purchase.add(Integer.valueOf(i));
            this.vip.put(vip, Integer.valueOf(i));
            return i;
        }
    }

    public final Object vip(C8027e c8027e) {
        Object license = C16669e.ad.license(this.ad, C5717e.vip, AbstractC4306e.purchase(this.license), new C4870e(this, null, 26), c8027e);
        return license == EnumC2821e.f6782e ? license : Unit.INSTANCE;
    }
}
