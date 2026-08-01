package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14188e {
    public final C17519e ad = new C17519e(0);
    public final C17519e vip = new C17519e(0);

    public static C14188e ad(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return vip(context, resourceId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, eؒٙۧ] */
    public static C14188e metrica(ArrayList arrayList) {
        C14188e c14188e = new C14188e();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c14188e.billing(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC16664e.vip;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC16664e.metrica;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC16664e.license;
            }
            ?? obj = new Object();
            obj.license = 0;
            obj.appmetrica = 1;
            obj.ad = startDelay;
            obj.vip = duration;
            obj.metrica = interpolator;
            obj.license = objectAnimator.getRepeatCount();
            obj.appmetrica = objectAnimator.getRepeatMode();
            c14188e.ad.put(propertyName, obj);
        }
        return c14188e;
    }

    public static C14188e vip(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return metrica(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return metrica(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public final PropertyValuesHolder[] appmetrica(String str) {
        if (!purchase(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.vip.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final void billing(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.vip.put(str, propertyValuesHolderArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14188e) {
            return this.ad.equals(((C14188e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final ObjectAnimator license(String str, Object obj, Property property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, appmetrica(str));
        ofPropertyValuesHolder.setProperty(property);
        C17519e c17519e = this.ad;
        if (c17519e.get(str) == null) {
            throw new IllegalArgumentException();
        }
        C1142e c1142e = (C1142e) c17519e.get(str);
        ofPropertyValuesHolder.setStartDelay(c1142e.ad);
        ofPropertyValuesHolder.setDuration(c1142e.vip);
        ofPropertyValuesHolder.setInterpolator(c1142e.ad());
        ofPropertyValuesHolder.setRepeatCount(c1142e.license);
        ofPropertyValuesHolder.setRepeatMode(c1142e.appmetrica);
        return ofPropertyValuesHolder;
    }

    public final boolean purchase(String str) {
        return this.vip.get(str) != null;
    }

    public final String toString() {
        return "\n" + C14188e.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.ad + "}\n";
    }
}
