package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18109e implements Cloneable {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public InterfaceC10190e[] f35509e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public ArrayList f35510e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public ArrayList f35521e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public long f35525e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public long f35527e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final Animator[] f35506e = new Animator[0];

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public static final int[] f35504e = {2, 1, 3, 4};

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public static final C7249e f35505e = new C7249e(11);

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public static final ThreadLocal f35507e = new ThreadLocal();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f35528e = getClass().getName();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f35516e = -1;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f35511e = -1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public TimeInterpolator f35524e = null;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ArrayList f35508e = new ArrayList();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final ArrayList f35530e = new ArrayList();

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C11980e f35529e = new C11980e(19);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C11980e f35520e = new C11980e(19);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C16694e f35526e = null;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int[] f35512e = f35504e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final ArrayList f35514e = new ArrayList();

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public Animator[] f35518e = f35506e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f35519e = 0;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f35517e = false;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f35515e = false;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public AbstractC18109e f35523e = null;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public ArrayList f35531e = null;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public ArrayList f35513e = new ArrayList();

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public C7249e f35522e = f35505e;

    /* JADX WARN: Type inference failed for: r1v2, types: [eٕ٘ؔ, eؓۨۖ, java.lang.Object] */
    public static C2271e admob() {
        ThreadLocal threadLocal = f35507e;
        C2271e c2271e = (C2271e) threadLocal.get();
        if (c2271e != null) {
            return c2271e;
        }
        ?? c17519e = new C17519e(0);
        threadLocal.set(c17519e);
        return c17519e;
    }

    public static boolean isVip(C4314e c4314e, C4314e c4314e2, String str) {
        Object obj = c4314e.ad.get(str);
        Object obj2 = c4314e2.ad.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void vip(C11980e c11980e, View view, C4314e c4314e) {
        C2271e c2271e = (C2271e) c11980e.f23950e;
        C2271e c2271e2 = (C2271e) c11980e.f23948e;
        SparseArray sparseArray = (SparseArray) c11980e.f23949e;
        C2692e c2692e = (C2692e) c11980e.f23951e;
        c2271e.put(view, c4314e);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (c2271e2.containsKey(transitionName)) {
                c2271e2.put(transitionName, null);
            } else {
                c2271e2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c2692e.purchase(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c2692e.yandex(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c2692e.license(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c2692e.yandex(itemIdAtPosition, null);
                }
            }
        }
    }

    public final AbstractC18109e Signature() {
        C16694e c16694e = this.f35526e;
        return c16694e != null ? c16694e.Signature() : this;
    }

    public void ad(InterfaceC10190e interfaceC10190e) {
        if (this.f35531e == null) {
            this.f35531e = new ArrayList();
        }
        this.f35531e.add(interfaceC10190e);
    }

    @Override // 
    /* renamed from: adcel, reason: merged with bridge method [inline-methods] */
    public AbstractC18109e clone() {
        try {
            AbstractC18109e abstractC18109e = (AbstractC18109e) super.clone();
            abstractC18109e.f35513e = new ArrayList();
            abstractC18109e.f35529e = new C11980e(19);
            abstractC18109e.f35520e = new C11980e(19);
            abstractC18109e.f35521e = null;
            abstractC18109e.f35510e = null;
            abstractC18109e.f35523e = this;
            abstractC18109e.f35531e = null;
            return abstractC18109e;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public AbstractC18109e ads(InterfaceC10190e interfaceC10190e) {
        AbstractC18109e abstractC18109e;
        ArrayList arrayList = this.f35531e;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC10190e) && (abstractC18109e = this.f35523e) != null) {
                abstractC18109e.ads(interfaceC10190e);
            }
            if (this.f35531e.size() == 0) {
                this.f35531e = null;
            }
        }
        return this;
    }

    public final void amazon() {
        int i = this.f35519e - 1;
        this.f35519e = i;
        if (i == 0) {
            inmobi(this, C11180e.f22440e, false);
            for (int i2 = 0; i2 < ((C2692e) this.f35529e.f23951e).adcel(); i2++) {
                View view = (View) ((C2692e) this.f35529e.f23951e).mopub(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C2692e) this.f35520e.f23951e).adcel(); i3++) {
                View view2 = (View) ((C2692e) this.f35520e.f23951e).mopub(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f35515e = true;
        }
    }

    public void applovin() {
        C2271e admob = admob();
        this.f35525e = 0L;
        for (int i = 0; i < this.f35513e.size(); i++) {
            Animator animator = (Animator) this.f35513e.get(i);
            C17216e c17216e = (C17216e) admob.get(animator);
            if (animator != null && c17216e != null) {
                Animator animator2 = c17216e.purchase;
                long j = this.f35511e;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.f35516e;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.f35524e;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f35514e.add(animator);
                this.f35525e = Math.max(this.f35525e, AbstractC11815e.crashlytics(animator));
            }
        }
        this.f35513e.clear();
    }

    public final void appmetrica(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C4314e c4314e = new C4314e(view);
            if (z) {
                billing(c4314e);
            } else {
                license(c4314e);
            }
            c4314e.metrica.add(this);
            purchase(c4314e);
            if (z) {
                vip(this.f35529e, view, c4314e);
            } else {
                vip(this.f35520e, view, c4314e);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                appmetrica(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void billing(C4314e c4314e);

    /* renamed from: class */
    public void mo4169class(AbstractC12681e abstractC12681e) {
    }

    public void crashlytics(long j, long j2) {
        long j3 = this.f35525e;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.f35515e = false;
            inmobi(this, C11180e.f22441e, z);
        }
        ArrayList arrayList = this.f35514e;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f35518e);
        this.f35518e = f35506e;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            AbstractC11815e.m3243abstract(animator, Math.min(Math.max(0L, j), AbstractC11815e.crashlytics(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.f35518e = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.f35515e = true;
        }
        inmobi(this, C11180e.f22440e, z);
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m4473extends() {
        if (this.f35519e == 0) {
            inmobi(this, C11180e.f22441e, false);
            this.f35515e = false;
        }
        this.f35519e++;
    }

    public void firebase(long j) {
        this.f35511e = j;
    }

    /* renamed from: goto */
    public void mo4170goto(C7249e c7249e) {
        if (c7249e == null) {
            this.f35522e = f35505e;
        } else {
            this.f35522e = c7249e;
        }
    }

    public final void inmobi(AbstractC18109e abstractC18109e, C11180e c11180e, boolean z) {
        AbstractC18109e abstractC18109e2 = this.f35523e;
        if (abstractC18109e2 != null) {
            abstractC18109e2.inmobi(abstractC18109e, c11180e, z);
        }
        ArrayList arrayList = this.f35531e;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f35531e.size();
        InterfaceC10190e[] interfaceC10190eArr = this.f35509e;
        if (interfaceC10190eArr == null) {
            interfaceC10190eArr = new InterfaceC10190e[size];
        }
        this.f35509e = null;
        InterfaceC10190e[] interfaceC10190eArr2 = (InterfaceC10190e[]) this.f35531e.toArray(interfaceC10190eArr);
        for (int i = 0; i < size; i++) {
            InterfaceC10190e interfaceC10190e = interfaceC10190eArr2[i];
            switch (c11180e.f22444e) {
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    interfaceC10190e.license(abstractC18109e);
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    interfaceC10190e.appmetrica(abstractC18109e);
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    interfaceC10190e.billing(abstractC18109e);
                    break;
                case 20:
                    interfaceC10190e.vip();
                    break;
                default:
                    interfaceC10190e.purchase();
                    break;
            }
            interfaceC10190eArr2[i] = null;
        }
        this.f35509e = interfaceC10190eArr2;
    }

    /* renamed from: interface */
    public void mo4171interface(TimeInterpolator timeInterpolator) {
        this.f35524e = timeInterpolator;
    }

    public void isPro(View view) {
        if (this.f35515e) {
            return;
        }
        ArrayList arrayList = this.f35514e;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f35518e);
        this.f35518e = f35506e;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f35518e = animatorArr;
        inmobi(this, C11180e.f22439e, false);
        this.f35517e = true;
    }

    public abstract void license(C4314e c4314e);

    public final C4314e loadAd(View view, boolean z) {
        C16694e c16694e = this.f35526e;
        if (c16694e != null) {
            return c16694e.loadAd(view, z);
        }
        ArrayList arrayList = z ? this.f35521e : this.f35510e;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C4314e c4314e = (C4314e) arrayList.get(i);
            if (c4314e == null) {
                return null;
            }
            if (c4314e.vip == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C4314e) (z ? this.f35510e : this.f35521e).get(i);
        }
        return null;
    }

    public void metrica() {
        ArrayList arrayList = this.f35514e;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f35518e);
        this.f35518e = f35506e;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f35518e = animatorArr;
        inmobi(this, C11180e.f22442e, false);
    }

    public Animator mopub(ViewGroup viewGroup, C4314e c4314e, C4314e c4314e2) {
        return null;
    }

    /* renamed from: native */
    public void mo4172native(long j) {
        this.f35516e = j;
    }

    public void premium(View view) {
        if (this.f35517e) {
            if (!this.f35515e) {
                ArrayList arrayList = this.f35514e;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f35518e);
                this.f35518e = f35506e;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f35518e = animatorArr;
                inmobi(this, C11180e.f22443e, false);
            }
            this.f35517e = false;
        }
    }

    public boolean pro() {
        return !this.f35514e.isEmpty();
    }

    public void purchase(C4314e c4314e) {
    }

    public final C4314e remoteconfig(View view, boolean z) {
        C16694e c16694e = this.f35526e;
        if (c16694e != null) {
            return c16694e.remoteconfig(view, z);
        }
        return (C4314e) ((C2271e) (z ? this.f35529e : this.f35520e).f23950e).get(view);
    }

    public boolean signatures(C4314e c4314e, C4314e c4314e2) {
        if (c4314e != null && c4314e2 != null) {
            String[] subscription = subscription();
            if (subscription != null) {
                for (String str : subscription) {
                    if (isVip(c4314e, c4314e2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c4314e.ad.keySet().iterator();
                while (it.hasNext()) {
                    if (isVip(c4314e, c4314e2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, eٗۗۢ] */
    public void smaato(ViewGroup viewGroup, C11980e c11980e, C11980e c11980e2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        C4314e c4314e;
        Animator animator;
        C4314e c4314e2;
        C2271e admob = admob();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        Signature().getClass();
        int i3 = 0;
        while (i3 < size) {
            C4314e c4314e3 = (C4314e) arrayList.get(i3);
            C4314e c4314e4 = (C4314e) arrayList2.get(i3);
            if (c4314e3 != null && !c4314e3.metrica.contains(this)) {
                c4314e3 = null;
            }
            if (c4314e4 != null && !c4314e4.metrica.contains(this)) {
                c4314e4 = null;
            }
            if ((c4314e3 != null || c4314e4 != null) && (c4314e3 == null || c4314e4 == null || signatures(c4314e3, c4314e4))) {
                Animator mopub = mopub(viewGroup, c4314e3, c4314e4);
                if (mopub != null) {
                    String str = this.f35528e;
                    if (c4314e4 != null) {
                        view = c4314e4.vip;
                        String[] subscription = subscription();
                        if (subscription != null && subscription.length > 0) {
                            c4314e2 = new C4314e(view);
                            C4314e c4314e5 = (C4314e) ((C2271e) c11980e2.f23950e).get(view);
                            i = size;
                            if (c4314e5 != null) {
                                int i4 = 0;
                                while (i4 < subscription.length) {
                                    String str2 = subscription[i4];
                                    c4314e2.ad.put(str2, c4314e5.ad.get(str2));
                                    i4++;
                                    i3 = i3;
                                    c4314e5 = c4314e5;
                                }
                            }
                            i2 = i3;
                            int i5 = admob.f34352e;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator = mopub;
                                    break;
                                }
                                C17216e c17216e = (C17216e) admob.get((Animator) admob.purchase(i6));
                                if (c17216e.metrica != null && c17216e.ad == view && c17216e.vip.equals(str) && c17216e.metrica.equals(c4314e2)) {
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = mopub;
                            c4314e2 = null;
                        }
                        mopub = animator;
                        c4314e = c4314e2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c4314e3.vip;
                        c4314e = null;
                    }
                    if (mopub != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.ad = view;
                        obj.vip = str;
                        obj.metrica = c4314e;
                        obj.license = windowId;
                        obj.appmetrica = this;
                        obj.purchase = mopub;
                        admob.put(mopub, obj);
                        this.f35513e.add(mopub);
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                C17216e c17216e2 = (C17216e) admob.get((Animator) this.f35513e.get(sparseIntArray.keyAt(i7)));
                c17216e2.purchase.setStartDelay(c17216e2.purchase.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public final void startapp(boolean z) {
        if (z) {
            ((C2271e) this.f35529e.f23950e).clear();
            ((SparseArray) this.f35529e.f23949e).clear();
            ((C2692e) this.f35529e.f23951e).vip();
        } else {
            ((C2271e) this.f35520e.f23950e).clear();
            ((SparseArray) this.f35520e.f23949e).clear();
            ((C2692e) this.f35520e.f23951e).vip();
        }
    }

    public void subs() {
        m4473extends();
        C2271e admob = admob();
        Iterator it = this.f35513e.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (admob.containsKey(animator)) {
                m4473extends();
                if (animator != null) {
                    animator.addListener(new C6318e(this, admob));
                    long j = this.f35511e;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f35516e;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f35524e;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C9380e(8, this));
                    animator.start();
                }
            }
        }
        this.f35513e.clear();
        amazon();
    }

    public String[] subscription() {
        return null;
    }

    public final boolean tapsense(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f35508e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f35530e;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* renamed from: this */
    public void mo4173this() {
    }

    /* renamed from: throw */
    public String mo4174throw(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f35511e != -1) {
            sb.append("dur(");
            sb.append(this.f35511e);
            sb.append(") ");
        }
        if (this.f35516e != -1) {
            sb.append("dly(");
            sb.append(this.f35516e);
            sb.append(") ");
        }
        if (this.f35524e != null) {
            sb.append("interp(");
            sb.append(this.f35524e);
            sb.append(") ");
        }
        ArrayList arrayList = this.f35508e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f35530e;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public final String toString() {
        return mo4174throw(BuildConfig.FLAVOR);
    }

    public final void yandex(ViewGroup viewGroup, boolean z) {
        startapp(z);
        ArrayList arrayList = this.f35508e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f35530e;
        if (size <= 0 && arrayList2.size() <= 0) {
            appmetrica(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                C4314e c4314e = new C4314e(findViewById);
                if (z) {
                    billing(c4314e);
                } else {
                    license(c4314e);
                }
                c4314e.metrica.add(this);
                purchase(c4314e);
                if (z) {
                    vip(this.f35529e, findViewById, c4314e);
                } else {
                    vip(this.f35520e, findViewById, c4314e);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C4314e c4314e2 = new C4314e(view);
            if (z) {
                billing(c4314e2);
            } else {
                license(c4314e2);
            }
            c4314e2.metrica.add(this);
            purchase(c4314e2);
            if (z) {
                vip(this.f35529e, view, c4314e2);
            } else {
                vip(this.f35520e, view, c4314e2);
            }
        }
    }
}
