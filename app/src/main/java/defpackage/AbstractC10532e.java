package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.purchase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۛ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10532e {
    public static VKXApplication ad;
    public static Resources vip;
    public static final SparseIntArray metrica = new SparseIntArray();
    public static final SparseArray license = new SparseArray();
    public static final ArrayList appmetrica = new ArrayList();
    public static final ArrayList purchase = new ArrayList();
    public static final ArrayList billing = new ArrayList();
    public static final ArrayList yandex = new ArrayList();
    public static final HashMap startapp = new HashMap();
    public static final ArrayList adcel = new ArrayList();

    public static void ad(Class cls, Class cls2) {
        try {
            startapp.put(cls.getName(), cls2.getConstructor(Context.class, AttributeSet.class));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static void license(int i) {
        int next;
        int identifier;
        int next2;
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = appmetrica;
        if (arrayList.contains(valueOf)) {
            return;
        }
        boolean contains = billing.contains(Integer.valueOf(i));
        SparseArray sparseArray = license;
        if (contains) {
            sparseArray.put(i, new SparseArray());
            arrayList.add(Integer.valueOf(i));
            return;
        }
        Iterator it = yandex.iterator();
        while (it.hasNext()) {
            ((C15438e) it.next()).getClass();
            if (i == R.layout.preference_material) {
                SparseArray sparseArray2 = new SparseArray();
                C13448e c13448e = new C13448e();
                c13448e.ad = android.R.id.title;
                c13448e.vip.add(new C4683e(android.R.attr.textColor, R.attr.text_primary));
                sparseArray2.put(android.R.id.title, c13448e);
                C13448e c13448e2 = new C13448e();
                c13448e2.ad = android.R.id.summary;
                c13448e2.vip.add(new C4683e(android.R.attr.textColor, R.attr.text_secondary));
                sparseArray2.put(android.R.id.summary, c13448e2);
                sparseArray.put(i, sparseArray2);
                if (arrayList.contains(Integer.valueOf(i))) {
                    return;
                }
                arrayList.add(Integer.valueOf(i));
                return;
            }
        }
        try {
            XmlResourceParser layout = vip.getLayout(i);
            do {
                next = layout.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(layout.getPositionDescription() + ": No start tag found!");
            }
            SparseArray sparseArray3 = new SparseArray();
            int depth = layout.getDepth();
            do {
                String name = layout.getName();
                AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
                String str = null;
                int i2 = 0;
                if (name.equals("include")) {
                    int attributeResourceValue = asAttributeSet.getAttributeResourceValue(null, "layout", 0);
                    if (attributeResourceValue != 0 && !arrayList.contains(Integer.valueOf(attributeResourceValue))) {
                        license(attributeResourceValue);
                    }
                    if (attributeResourceValue != 0) {
                        SparseArray sparseArray4 = (SparseArray) sparseArray.get(attributeResourceValue);
                        while (i2 < sparseArray4.size()) {
                            sparseArray3.put(sparseArray4.keyAt(i2), (C13448e) sparseArray4.valueAt(i2));
                            i2++;
                        }
                    }
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= asAttributeSet.getAttributeCount()) {
                            break;
                        }
                        if (asAttributeSet.getAttributeName(i3).equals("id")) {
                            str = asAttributeSet.getAttributeValue(i3);
                            break;
                        }
                        i3++;
                    }
                    int parseInt = str == null ? -1 : Integer.parseInt(str.substring(1));
                    if (parseInt != -1) {
                        C13448e c13448e3 = new C13448e();
                        c13448e3.ad = parseInt;
                        while (i2 < asAttributeSet.getAttributeCount()) {
                            int attributeNameResource = asAttributeSet.getAttributeNameResource(i2);
                            String attributeValue = asAttributeSet.getAttributeValue(i2);
                            if (attributeValue.startsWith("?")) {
                                try {
                                    identifier = Integer.parseInt(attributeValue.substring(1));
                                } catch (NumberFormatException unused) {
                                    int i4 = 9;
                                    boolean equals = attributeValue.substring(1, Math.min(attributeValue.length(), 9)).equals("android:");
                                    Resources resources = vip;
                                    if (!equals) {
                                        i4 = 1;
                                    }
                                    identifier = resources.getIdentifier(attributeValue.substring(i4), "attr", equals ? "android" : ad.getPackageName());
                                }
                                try {
                                    AbstractC15933e.ad(identifier);
                                    c13448e3.vip.add(new C4683e(attributeNameResource, identifier));
                                } catch (Exception unused2) {
                                }
                            }
                            i2++;
                        }
                        sparseArray3.put(c13448e3.ad, c13448e3);
                    }
                }
                next2 = layout.next();
                if (next2 == 3 && layout.getDepth() <= depth) {
                    break;
                }
            } while (next2 != 1);
            if (!arrayList.contains(Integer.valueOf(i))) {
                arrayList.add(Integer.valueOf(i));
            }
            sparseArray.put(i, sparseArray3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void metrica(View view, SparseArray sparseArray) {
        C13448e c13448e;
        int id = view.getId();
        if (id != -1 && !purchase.contains(Integer.valueOf(id)) && sparseArray != null && (c13448e = (C13448e) sparseArray.get(id)) != null) {
            ArrayList arrayList = c13448e.vip;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((C4683e) it.next()).ad));
            }
            Iterator it2 = adcel.iterator();
            if (it2.hasNext()) {
                throw AbstractC5087e.m1747goto(it2);
            }
            view.setTag(R.id.theme_tag, c13448e);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                metrica(viewGroup.getChildAt(i), sparseArray);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void vip(View view) {
        int id = view.getId();
        if (id == -1 || !purchase.contains(Integer.valueOf(id))) {
            Object tag = view.getTag(R.id.theme_tag);
            if (tag instanceof C13448e) {
                Iterator it = ((C13448e) tag).vip.iterator();
                while (it.hasNext()) {
                    C4683e c4683e = (C4683e) it.next();
                    int i = c4683e.ad;
                    if (((C13017e) InterfaceC14080e.vip.get(i << (c4683e.vip + 32))) != null) {
                        view.setBackground(new RippleDrawable(ColorStateList.valueOf(AbstractC15933e.ad(android.R.attr.colorControlHighlight)), null, null));
                    } else {
                        List list = (List) InterfaceC14080e.ad.get(i);
                        if (list != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC14080e) it2.next()).ad(view, AbstractC15933e.ad(c4683e.vip));
                            }
                        }
                    }
                }
            }
            if (view instanceof InterfaceC12807e) {
                ((InterfaceC12807e) view).refreshTheme();
            }
            if (view instanceof RecyclerView) {
                purchase.ad((RecyclerView) view);
            }
            if (view instanceof C1059e) {
                C1059e c1059e = (C1059e) view;
                Iterator<View> it3 = c1059e.getDestroyedViews().iterator();
                while (it3.hasNext()) {
                    vip(it3.next());
                }
                Iterator<AbstractC13859e> it4 = c1059e.getFragmentStack().iterator();
                while (it4.hasNext()) {
                    it4.next().firebase();
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    vip(viewGroup.getChildAt(i2));
                }
            }
        }
    }
}
