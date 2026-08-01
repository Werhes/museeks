package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؐۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6843e {
    public final HashMap ad;
    public final ArrayList metrica;
    public final HashMap vip;

    public C6843e(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.ad = new HashMap();
        this.vip = new HashMap();
        this.metrica = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC1312e interfaceC1312e = (InterfaceC1312e) it.next();
            if (TextUtils.isEmpty(interfaceC1312e.startapp())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                InterfaceC1312e interfaceC1312e2 = (InterfaceC1312e) this.ad.put(interfaceC1312e.startapp(), interfaceC1312e);
                if (interfaceC1312e2 != null) {
                    String canonicalName = interfaceC1312e2.getClass().getCanonicalName();
                    String canonicalName2 = interfaceC1312e.getClass().getCanonicalName();
                    throw new IllegalArgumentException(AbstractC4653e.ads(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw AbstractC5087e.m1747goto(it2);
        }
        this.metrica.addAll(list);
    }

    public final Object ad(Uri uri, InterfaceC7998e interfaceC7998e) {
        return interfaceC7998e.ad(vip(uri));
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [eِؒۜ, java.lang.Object] */
    public final C11467e vip(Uri uri) {
        List list;
        C13304e Signature = AbstractC17475e.Signature();
        C13304e Signature2 = AbstractC17475e.Signature();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            list = C1410e.f4222e;
        } else {
            String substring = encodedFragment.substring(10);
            C0381e c0381e = new C0381e(new C6594e(28, new C18142e("+".charAt(0), 0)), true, (AbstractC7723e) C8382e.f17147e, Alert.DURATION_SHOW_INDEFINITELY);
            substring.getClass();
            list = AbstractC17475e.subscription(new C10829e(c0381e, substring));
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            Matcher matcher = AbstractC2620e.ad.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            Signature2.metrica(matcher.group(1));
        }
        C1410e billing = Signature2.billing();
        if (billing.f4224e > 0) {
            String str2 = (String) billing.get(0);
            if (this.vip.get(str2) != null) {
                throw new ClassCastException();
            }
            String valueOf = String.valueOf(uri);
            throw new IOException(AbstractC4653e.ads(new StringBuilder(str2.length() + 40 + valueOf.length()), "Requested transform isn't registered: ", str2, ": ", valueOf));
        }
        AbstractC17475e crashlytics = Signature.billing().crashlytics();
        C11980e c11980e = new C11980e(24, false);
        String scheme = uri.getScheme();
        InterfaceC1312e interfaceC1312e = (InterfaceC1312e) this.ad.get(scheme);
        if (interfaceC1312e == null) {
            throw new IOException(AbstractC17861e.Signature("Requested backend isn't registered: ", scheme));
        }
        c11980e.f23950e = interfaceC1312e;
        c11980e.f23951e = this.metrica;
        c11980e.f23949e = crashlytics;
        if (!crashlytics.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = crashlytics.listIterator(crashlytics.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        throw new ClassCastException();
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        c11980e.f23948e = uri;
        ?? obj = new Object();
        obj.f23072e = (InterfaceC1312e) c11980e.f23950e;
        obj.f23070e = (AbstractC17475e) c11980e.f23949e;
        obj.f23069e = (ArrayList) c11980e.f23951e;
        obj.f23071e = (Uri) c11980e.f23948e;
        return obj;
    }
}
