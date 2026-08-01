package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import java.lang.reflect.Constructor;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C12133e implements LayoutInflater.Factory2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f24297e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24298e;

    public /* synthetic */ LayoutInflaterFactory2C12133e(int i, Object obj) {
        this.f24298e = i;
        this.f24297e = obj;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        C5221e billing;
        int i = this.f24298e;
        Object obj = this.f24297e;
        switch (i) {
            case 0:
                AbstractC15958e abstractC15958e = (AbstractC15958e) obj;
                if (FragmentContainerView.class.getName().equals(str)) {
                    return new FragmentContainerView(context, attributeSet, abstractC15958e);
                }
                if ("fragment".equals(str)) {
                    String attributeValue = attributeSet.getAttributeValue(null, "class");
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC11457e.ad);
                    if (attributeValue == null) {
                        attributeValue = obtainStyledAttributes.getString(0);
                    }
                    int resourceId = obtainStyledAttributes.getResourceId(1, -1);
                    String string = obtainStyledAttributes.getString(2);
                    obtainStyledAttributes.recycle();
                    if (attributeValue != null) {
                        try {
                            z = AbstractComponentCallbacksC17875e.class.isAssignableFrom(C11419e.vip(context.getClassLoader(), attributeValue));
                        } catch (ClassNotFoundException unused) {
                            z = false;
                        }
                        if (z) {
                            int id = view != null ? view.getId() : 0;
                            if (id == -1 && resourceId == -1 && string == null) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                            }
                            AbstractComponentCallbacksC17875e premium = resourceId != -1 ? abstractC15958e.premium(resourceId) : null;
                            if (premium == null && string != null) {
                                premium = abstractC15958e.subs(string);
                            }
                            if (premium == null && id != -1) {
                                premium = abstractC15958e.premium(id);
                            }
                            if (premium == null) {
                                C11419e m4058interface = abstractC15958e.m4058interface();
                                context.getClassLoader();
                                premium = m4058interface.ad(attributeValue);
                                premium.f35075e = true;
                                premium.f35104e = resourceId != 0 ? resourceId : id;
                                premium.f35092e = id;
                                premium.f35089e = string;
                                premium.f35083e = true;
                                premium.f35112e = abstractC15958e;
                                C2386e c2386e = abstractC15958e.isVip;
                                premium.f35074e = c2386e;
                                AbstractActivityC1752e abstractActivityC1752e = c2386e.f6096e;
                                premium.f35094e = true;
                                if ((c2386e != null ? c2386e.f6097e : null) != null) {
                                    premium.f35094e = true;
                                }
                                billing = abstractC15958e.ad(premium);
                                if (AbstractC15958e.m4045native(2)) {
                                    Log.v("FragmentManager", "Fragment " + premium + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                                }
                            } else {
                                if (premium.f35083e) {
                                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                                }
                                premium.f35083e = true;
                                premium.f35112e = abstractC15958e;
                                C2386e c2386e2 = abstractC15958e.isVip;
                                premium.f35074e = c2386e2;
                                AbstractActivityC1752e abstractActivityC1752e2 = c2386e2.f6096e;
                                premium.f35094e = true;
                                if ((c2386e2 != null ? c2386e2.f6097e : null) != null) {
                                    premium.f35094e = true;
                                }
                                billing = abstractC15958e.billing(premium);
                                if (AbstractC15958e.m4045native(2)) {
                                    Log.v("FragmentManager", "Retained Fragment " + premium + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            C4935e c4935e = AbstractC11220e.ad;
                            AbstractC11220e.vip(new C6964e(premium, "Attempting to use <fragment> tag to add fragment " + premium + " to container " + viewGroup));
                            AbstractC11220e.ad(premium).getClass();
                            premium.f35078e = viewGroup;
                            billing.mopub();
                            billing.adcel();
                            View view2 = premium.f35098e;
                            if (view2 == null) {
                                throw new IllegalStateException(AbstractC5087e.m1746extends("Fragment ", attributeValue, " did not create a view."));
                            }
                            if (resourceId != 0) {
                                view2.setId(resourceId);
                            }
                            if (premium.f35098e.getTag() == null) {
                                premium.f35098e.setTag(string);
                            }
                            premium.f35098e.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13636e(this, billing));
                            return premium.f35098e;
                        }
                    }
                }
                return null;
            default:
                HashMap hashMap = AbstractC10532e.startapp;
                if (!hashMap.containsKey(str)) {
                    return ((LayoutInflater.Factory2) obj).onCreateView(view, str, context, attributeSet);
                }
                try {
                    return (View) ((Constructor) hashMap.get(str)).newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        switch (this.f24298e) {
            case 0:
                return onCreateView(null, str, context, attributeSet);
            default:
                HashMap hashMap = AbstractC10532e.startapp;
                if (!hashMap.containsKey(str)) {
                    return ((LayoutInflater.Factory2) this.f24297e).onCreateView(str, context, attributeSet);
                }
                try {
                    return (View) ((Constructor) hashMap.get(str)).newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
