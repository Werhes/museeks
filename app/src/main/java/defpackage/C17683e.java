package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17683e extends MenuInflater {
    public static final Class[] appmetrica;
    public static final Class[] purchase;
    public final Object[] ad;
    public Object license;
    public final Context metrica;
    public final Object[] vip;

    static {
        Class[] clsArr = {Context.class};
        appmetrica = clsArr;
        purchase = clsArr;
    }

    public C17683e(Context context) {
        super(context);
        this.metrica = context;
        Object[] objArr = {context};
        this.ad = objArr;
        this.vip = objArr;
    }

    public static Object ad(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? ad(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC8939e)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.metrica.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC8939e) {
                    MenuC8939e menuC8939e = (MenuC8939e) menu;
                    if (!menuC8939e.f17936e) {
                        menuC8939e.isVip();
                        z = true;
                    }
                }
                vip(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((MenuC8939e) menu).tapsense();
                }
                xmlResourceParser.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC8939e) menu).tapsense();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    public final void vip(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        C13562e c13562e = new C13562e(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    } else if (name2.equals("group")) {
                        c13562e.vip = 0;
                        c13562e.metrica = 0;
                        c13562e.license = 0;
                        c13562e.appmetrica = 0;
                        c13562e.purchase = true;
                        c13562e.billing = true;
                    } else if (name2.equals("item")) {
                        if (!c13562e.yandex) {
                            ActionProviderVisibilityListenerC0616e actionProviderVisibilityListenerC0616e = c13562e.applovin;
                            if (actionProviderVisibilityListenerC0616e == null || !actionProviderVisibilityListenerC0616e.vip.hasSubMenu()) {
                                c13562e.yandex = true;
                                c13562e.vip(c13562e.ad.add(c13562e.vip, c13562e.startapp, c13562e.adcel, c13562e.mopub));
                            } else {
                                c13562e.yandex = true;
                                c13562e.vip(c13562e.ad.addSubMenu(c13562e.vip, c13562e.startapp, c13562e.adcel, c13562e.mopub).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.metrica;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6062e.Signature);
                        c13562e.vip = obtainStyledAttributes.getResourceId(1, 0);
                        c13562e.metrica = obtainStyledAttributes.getInt(3, 0);
                        c13562e.license = obtainStyledAttributes.getInt(4, 0);
                        c13562e.appmetrica = obtainStyledAttributes.getInt(5, 0);
                        c13562e.purchase = obtainStyledAttributes.getBoolean(2, true);
                        c13562e.billing = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC6062e.admob);
                            c13562e.startapp = obtainStyledAttributes2.getResourceId(2, 0);
                            c13562e.adcel = (obtainStyledAttributes2.getInt(5, c13562e.metrica) & (-65536)) | (obtainStyledAttributes2.getInt(6, c13562e.license) & 65535);
                            c13562e.mopub = obtainStyledAttributes2.getText(7);
                            c13562e.advert = obtainStyledAttributes2.getText(8);
                            c13562e.smaato = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c13562e.amazon = string == null ? (char) 0 : string.charAt(0);
                            c13562e.loadAd = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c13562e.Signature = string2 == null ? (char) 0 : string2.charAt(0);
                            c13562e.admob = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c13562e.subscription = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c13562e.subscription = c13562e.appmetrica;
                            }
                            c13562e.remoteconfig = obtainStyledAttributes2.getBoolean(3, false);
                            c13562e.pro = obtainStyledAttributes2.getBoolean(4, c13562e.purchase);
                            c13562e.signatures = obtainStyledAttributes2.getBoolean(1, c13562e.billing);
                            c13562e.tapsense = obtainStyledAttributes2.getInt(21, -1);
                            c13562e.isPro = obtainStyledAttributes2.getString(12);
                            c13562e.isVip = obtainStyledAttributes2.getResourceId(13, 0);
                            c13562e.inmobi = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && c13562e.isVip == 0 && c13562e.inmobi == null) {
                                c13562e.applovin = (ActionProviderVisibilityListenerC0616e) c13562e.ad(string3, purchase, this.vip);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c13562e.applovin = null;
                            }
                            c13562e.ads = obtainStyledAttributes2.getText(17);
                            c13562e.premium = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c13562e.crashlytics = AbstractC13982e.metrica(obtainStyledAttributes2.getInt(19, -1), c13562e.crashlytics);
                            } else {
                                c13562e.crashlytics = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC10077e.amazon(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c13562e.subs = colorStateList;
                            } else {
                                c13562e.subs = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c13562e.yandex = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            c13562e.yandex = true;
                            SubMenu addSubMenu = c13562e.ad.addSubMenu(c13562e.vip, c13562e.startapp, c13562e.adcel, c13562e.mopub);
                            c13562e.vip(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            vip(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }
}
