package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٙٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8778e {
    public static final C8778e advert;
    public static final C8778e smaato;
    public final int ad;
    public final HashSet adcel;
    public final boolean appmetrica;
    public final boolean billing;
    public final boolean license;
    public final int metrica;
    public final HashSet mopub;
    public final boolean purchase;
    public final HashSet startapp;
    public final int vip;
    public final C8770e yandex;

    static {
        C11100e c11100e = new C11100e();
        c11100e.license = 1;
        c11100e.billing = true;
        c11100e.startapp = false;
        C8778e c8778e = new C8778e(c11100e);
        advert = c8778e;
        C11100e c11100e2 = new C11100e();
        c11100e2.license = 2;
        c11100e2.billing = true;
        c11100e2.startapp = true;
        c11100e2.vip();
        C11100e c11100e3 = new C11100e();
        c11100e3.mopub = C8770e.vip;
        c11100e3.license = 2;
        C8778e c8778e2 = new C8778e(c11100e3);
        C11100e c11100e4 = new C11100e(c8778e2);
        C8770e c8770e = C8770e.license;
        c11100e4.mopub = c8770e;
        c11100e4.purchase = 2;
        c11100e4.startapp = true;
        c11100e4.vip();
        C11100e c11100e5 = new C11100e(c8778e2);
        c11100e5.mopub = c8770e;
        c11100e5.purchase = 2;
        c11100e5.appmetrica = 1;
        c11100e5.startapp = true;
        smaato = new C8778e(c11100e5);
        C11100e c11100e6 = new C11100e(c8778e2);
        c11100e6.purchase = 1;
        c11100e6.mopub = C8770e.appmetrica;
        c11100e6.startapp = true;
        c11100e6.adcel = true;
        c11100e6.vip();
        C11100e c11100e7 = new C11100e(c8778e2);
        c11100e7.license = 4;
        c11100e7.purchase = 4;
        c11100e7.appmetrica = 1;
        c11100e7.mopub = C8770e.purchase;
        c11100e7.startapp = true;
        c11100e7.adcel = true;
        c11100e7.vip();
        C11100e c11100e8 = new C11100e(c8778e2);
        c11100e8.license = 4;
        c11100e8.appmetrica = 1;
        c11100e8.startapp = true;
        c11100e8.adcel = true;
        c11100e8.vip();
        C11100e c11100e9 = new C11100e();
        c11100e9.license = 2;
        c11100e9.purchase = 2;
        c11100e9.appmetrica = 1;
        c11100e9.ad(1);
        c11100e9.ad(Action.TYPE_MEDIA_PLAYBACK);
        c11100e9.startapp = true;
        c11100e9.vip();
        C11100e c11100e10 = new C11100e();
        c11100e10.license = 1;
        c11100e10.purchase = 1;
        c11100e10.ad(1);
        c11100e10.billing = true;
        c11100e10.startapp = true;
        c11100e10.vip();
        C11100e c11100e11 = new C11100e();
        c11100e11.license = 2;
        c11100e11.ad(1);
        c11100e11.ad(Action.TYPE_COMPOSE_MESSAGE);
        c11100e11.ad(Action.TYPE_MEDIA_PLAYBACK);
        c11100e11.billing = true;
        c11100e11.yandex = true;
        c11100e11.startapp = true;
        c11100e11.vip();
        C11100e c11100e12 = new C11100e(c8778e);
        c11100e12.ad.add(Integer.valueOf(Action.TYPE_APP_ICON));
        c11100e12.vip();
    }

    public C8778e(C11100e c11100e) {
        int i = c11100e.license;
        this.ad = i;
        this.vip = c11100e.appmetrica;
        this.metrica = c11100e.purchase;
        this.yandex = c11100e.mopub;
        this.license = c11100e.billing;
        this.appmetrica = c11100e.yandex;
        this.purchase = c11100e.startapp;
        this.billing = c11100e.adcel;
        HashSet hashSet = new HashSet(c11100e.ad);
        this.startapp = hashSet;
        HashSet hashSet2 = new HashSet(c11100e.metrica);
        this.mopub = hashSet2;
        HashSet hashSet3 = c11100e.vip;
        HashSet hashSet4 = new HashSet(hashSet3);
        hashSet4.retainAll(hashSet);
        if (!hashSet4.isEmpty()) {
            throw new IllegalArgumentException("Disallowed action types cannot also be in the required set");
        }
        if (!hashSet3.isEmpty() && !hashSet2.isEmpty()) {
            throw new IllegalArgumentException("Both disallowed and allowed action type set cannot be defined.");
        }
        this.adcel = new HashSet(hashSet3);
        if (hashSet.size() > i) {
            throw new IllegalArgumentException("Required action types exceeded max allowed actions");
        }
    }

    public final void ad(List list) {
        HashSet hashSet = this.startapp;
        Set hashSet2 = hashSet.isEmpty() ? Collections.EMPTY_SET : new HashSet(hashSet);
        Iterator it = list.iterator();
        int i = this.ad;
        int i2 = this.vip;
        int i3 = this.metrica;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        while (it.hasNext()) {
            Action action = (Action) it.next();
            HashSet hashSet3 = this.adcel;
            if (!hashSet3.isEmpty() && hashSet3.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()) + " is disallowed");
            }
            HashSet hashSet4 = this.mopub;
            if (!hashSet4.isEmpty() && !hashSet4.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()) + " is not allowed");
            }
            hashSet2.remove(Integer.valueOf(action.getType()));
            CarText title = action.getTitle();
            if (title != null && !title.isEmpty()) {
                i6--;
                if (i6 < 0) {
                    throw new IllegalArgumentException(AbstractC1634e.smaato("Action list exceeded max number of ", i3, " actions with custom titles"));
                }
                this.yandex.vip(title);
            }
            i4--;
            if (i4 < 0) {
                throw new IllegalArgumentException(AbstractC1634e.smaato("Action list exceeded max number of ", i, " actions"));
            }
            if ((action.getFlags() & 1) != 0 && i5 - 1 < 0) {
                throw new IllegalArgumentException(AbstractC1634e.smaato("Action list exceeded max number of ", i2, " primary actions"));
            }
            if (this.license && action.getIcon() == null && !action.isStandard()) {
                throw new IllegalArgumentException("Non-standard actions without an icon are disallowed");
            }
            boolean z = this.appmetrica;
            if (z && ((action.getBackgroundColor() == null || CarColor.DEFAULT.equals(action.getBackgroundColor())) && !action.isStandard())) {
                throw new IllegalArgumentException("Non-standard actions without a background color are disallowed");
            }
            if (!z && !CarColor.DEFAULT.equals(action.getBackgroundColor()) && this.billing && (action.getFlags() & 1) == 0) {
                throw new IllegalArgumentException("Background color can only be set for primary actions");
            }
            if (!this.purchase && action.getOnClickDelegate() != null && !action.isStandard()) {
                throw new IllegalArgumentException("Setting a click listener for a custom action is disallowed");
            }
        }
        if (hashSet2.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            sb.append(Action.typeToString(((Integer) it2.next()).intValue()));
            sb.append(",");
        }
        throw new IllegalArgumentException(AbstractC8703e.pro("Missing required action types: ", sb));
    }
}
