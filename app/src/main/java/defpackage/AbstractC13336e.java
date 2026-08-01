package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.widget.TextView;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13336e {
    public static final C6575e ad = new C6575e(21);

    public static final C2330e ad(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new C2330e(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final Set appmetrica(ClassLoader classLoader) {
        Method method;
        ClassLoader parent = classLoader.getParent();
        Set appmetrica = parent != null ? appmetrica(parent) : C3295e.f7451e;
        if (classLoader instanceof URLClassLoader) {
            return AbstractC4511e.loadAd(AbstractC13480e.m3582e(AbstractC1660e.isPro(((URLClassLoader) classLoader).getURLs())), appmetrica);
        }
        Iterable iterable = null;
        try {
            try {
                Field billing = billing(classLoader.getClass());
                if (billing != null) {
                    billing.setAccessible(true);
                    Object obj = billing.get(classLoader);
                    if (obj != null && (method = obj.getClass().getMethod("getURLs", null)) != null) {
                        method.setAccessible(true);
                        URL[] urlArr = (URL[]) method.invoke(obj, null);
                        if (urlArr != null) {
                            iterable = AbstractC1660e.m670implements(urlArr);
                        }
                    }
                }
            } catch (Throwable unused) {
                iterable = startapp(classLoader);
            }
        } catch (Throwable unused2) {
        }
        return iterable == null ? appmetrica : AbstractC4511e.loadAd(appmetrica, iterable);
    }

    public static final Field billing(Class cls) {
        Field field;
        Field billing;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            if (AbstractC7890e.billing(field.getName(), "ucp") && field.getType().getSimpleName().equals("URLClassPath")) {
                break;
            }
            i++;
        }
        if (field != null) {
            return field;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || (billing = billing(superclass)) == null) {
            return null;
        }
        return billing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, eّٚۧ] */
    public static boolean license(Spannable spannable) {
        int i;
        int i2;
        int i3;
        boolean z;
        C12583e c12583e;
        boolean z2;
        boolean z3 = true;
        if (Build.VERSION.SDK_INT >= 28) {
            return Linkify.addLinks(spannable, 1);
        }
        Object[] objArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = objArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(objArr[length]);
        }
        ArrayList arrayList = new ArrayList();
        Pattern pattern = AbstractC2909e.ad;
        String[] strArr = {"http://", "https://", "rtsp://"};
        Linkify.MatchFilter matchFilter = Linkify.sUrlMatchFilter;
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) && group != null) {
                Object obj = new Object();
                int length2 = strArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        z = z3;
                        c12583e = obj;
                        z2 = false;
                        break;
                    }
                    int i5 = i4;
                    String str = strArr[i5];
                    int i6 = length2;
                    z = z3;
                    Object obj2 = obj;
                    if (group.regionMatches(true, 0, str, 0, str.length())) {
                        z2 = true;
                        c12583e = obj2;
                        if (!group.regionMatches(false, 0, str, 0, str.length())) {
                            StringBuilder inmobi = AbstractC8703e.inmobi(str);
                            inmobi.append(group.substring(str.length()));
                            group = inmobi.toString();
                            c12583e = obj2;
                        }
                    } else {
                        i4 = i5 + 1;
                        obj = obj2;
                        length2 = i6;
                        z3 = z;
                    }
                }
                if (!z2 && strArr.length > 0) {
                    group = AbstractC1786e.signatures(new StringBuilder(), strArr[0], group);
                }
                c12583e.vip = group;
                c12583e.metrica = start;
                c12583e.license = end;
                arrayList.add(c12583e);
            } else {
                z = z3;
            }
            z3 = z;
        }
        boolean z4 = z3;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            ?? obj3 = new Object();
            obj3.ad = uRLSpan;
            obj3.metrica = spannable.getSpanStart(uRLSpan);
            obj3.license = spannable.getSpanEnd(uRLSpan);
            arrayList.add(obj3);
        }
        Collections.sort(arrayList, ad);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size - 1) {
            C12583e c12583e2 = (C12583e) arrayList.get(i7);
            int i8 = i7 + 1;
            C12583e c12583e3 = (C12583e) arrayList.get(i8);
            int i9 = c12583e2.metrica;
            int i10 = c12583e3.metrica;
            if (i9 <= i10 && (i = c12583e2.license) > i10) {
                int i11 = c12583e3.license;
                int i12 = (i11 > i && (i2 = i - i9) <= (i3 = i11 - i10)) ? i2 < i3 ? i7 : -1 : i8;
                if (i12 != -1) {
                    Object obj4 = ((C12583e) arrayList.get(i12)).ad;
                    if (obj4 != null) {
                        spannable.removeSpan(obj4);
                    }
                    arrayList.remove(i12);
                    size--;
                }
            }
            i7 = i8;
        }
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12583e c12583e4 = (C12583e) it.next();
            if (c12583e4.ad == null) {
                spannable.setSpan(new URLSpan(c12583e4.vip), c12583e4.metrica, c12583e4.license, 33);
            }
        }
        return z4;
    }

    public static void metrica(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            Linkify.addLinks(textView, 1);
            return;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (license((Spannable) text) && !(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(text);
        if (license(valueOf)) {
            if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            textView.setText(valueOf);
        }
    }

    public static final Object purchase(AbstractC0232e abstractC0232e, InterfaceC5372e interfaceC5372e, InputStream inputStream) {
        C9770e c9770e = new C9770e(inputStream);
        C17044e c17044e = (C17044e) c9770e.f19315e;
        try {
            return AbstractC4508e.metrica(abstractC0232e, interfaceC5372e, c9770e);
        } finally {
            c17044e.getClass();
            C13708e.metrica.ad(c17044e.metrica.array());
        }
    }

    public static final ArrayList startapp(ClassLoader classLoader) {
        ArrayList ad2 = new C3532e(classLoader).ad();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(ad2, 10));
        Iterator it = ad2.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).replace('.', '/'));
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            List m1868package = AbstractC5304e.m1868package(str, new char[]{'/'});
            C11241e c11241e = new C11241e(1, m1868package.size(), 1);
            ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(c11241e, 10));
            Iterator it3 = c11241e.iterator();
            while (true) {
                C3296e c3296e = (C3296e) it3;
                if (c3296e.f7452e) {
                    arrayList2.add(AbstractC13480e.m3608try(m1868package.subList(0, c3296e.nextInt()), "/", null, null, null, 62));
                }
            }
            AbstractC13480e.inmobi(hashSet, AbstractC13480e.m3572catch(str, arrayList2));
        }
        ArrayList m3572catch = AbstractC13480e.m3572catch(BuildConfig.FLAVOR, AbstractC13480e.m3577else(hashSet, new C11021e(12)));
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = m3572catch.iterator();
        while (it4.hasNext()) {
            Enumeration<URL> resources = classLoader.getResources((String) it4.next());
            AbstractC13480e.inmobi(arrayList3, resources != null ? Collections.list(resources) : C13664e.f27089e);
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            Object next = it5.next();
            if (hashSet2.add(AbstractC5304e.m1857else(((URL) next).getPath(), '!'))) {
                arrayList4.add(next);
            }
        }
        return arrayList4;
    }

    public static final C8393e vip(C6674e c6674e) {
        return c6674e.equals(AbstractC9896e.vip) ? AbstractC9700e.ad : c6674e.equals(AbstractC9896e.ad) ? AbstractC9700e.vip : new C8393e(c6674e);
    }

    public static final boolean yandex(C2330e c2330e) {
        long j = c2330e.appmetrica;
        return (j >>> 32) == (4294967295L & j) && j == c2330e.purchase && j == c2330e.billing && j == c2330e.yandex;
    }
}
