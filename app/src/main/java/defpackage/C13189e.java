package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13189e implements InterfaceC3358e {
    public final InterfaceC8850e ad;
    public final C4622e license;
    public final EnumC4478e metrica;
    public TextClassifier purchase;
    public final Context vip;
    public final C17651e appmetrica = AbstractC12751e.ad();
    public final C0576e billing = AbstractC14533e.startapp(null);
    public final Object yandex = new Object();

    public C13189e(InterfaceC8850e interfaceC8850e, Context context, EnumC4478e enumC4478e, C4622e c4622e) {
        this.ad = interfaceC8850e;
        this.vip = context;
        this.metrica = enumC4478e;
        this.license = c4622e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:24:0x0071, B:26:0x0079, B:28:0x0083, B:32:0x0090, B:36:0x0098), top: B:23:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C13189e r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, defpackage.AbstractC10731e r21) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13189e.ad(eُْؒ, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, eُؑ۠):java.lang.Object");
    }

    public final Object appmetrica(CharSequence charSequence, long j, AbstractC7185e abstractC7185e) {
        if (charSequence.length() == 0 || C12347e.license(j)) {
            return null;
        }
        return AbstractC5336e.advert(this.ad, new C4624e(this, new C16553e(j, null, this, charSequence), null), abstractC7185e);
    }

    public final Object license(CharSequence charSequence, long j, AbstractC7185e abstractC7185e) {
        if (charSequence.length() == 0 || C12347e.license(j)) {
            return Unit.INSTANCE;
        }
        return AbstractC5336e.advert(this.ad, new C4624e(this, new C3983e(j, null, this, charSequence), null), abstractC7185e);
    }

    public final LocaleList metrica() {
        C4622e c4622e = this.license;
        if (c4622e == null) {
            AbstractC6418e.remoteconfig();
            return AbstractC6418e.license(new Locale[]{AbstractC16870e.ad.appmetrica().appmetrica().ad});
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c4622e, 10));
        Iterator it = c4622e.f9951e.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0768e) it.next()).ad);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return AbstractC6418e.license((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final void vip(C0765e c0765e, CharSequence charSequence, long j, Function1 function1) {
        C17651e c17651e = this.appmetrica;
        TextClassification textClassification = null;
        if (c17651e.purchase()) {
            C6254e c6254e = (C6254e) this.billing.getValue();
            TextClassification textClassification2 = (c6254e != null && C12347e.metrica(j, c6254e.vip) && AbstractC7890e.billing(charSequence, c6254e.ad)) ? c6254e.metrica : null;
            c17651e.billing(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            function1.invoke(c0765e);
            return;
        }
        boolean isEmpty = textClassification.getActions().isEmpty();
        Object obj = this.yandex;
        if (!isEmpty) {
            c0765e.ad.ad(new C15304e(obj, textClassification, 0));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            c0765e.ad.ad(new C15304e(obj, textClassification, -1));
        }
        function1.invoke(c0765e);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                c0765e.ad.ad(new C15304e(obj, textClassification, i));
            }
        }
    }
}
