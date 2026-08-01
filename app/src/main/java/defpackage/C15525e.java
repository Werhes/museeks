package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15525e {
    public final /* synthetic */ int ad;
    public int metrica;
    public final String vip;

    public C15525e(int i, String str) {
        this.ad = 2;
        this.metrica = i;
        this.vip = str;
    }

    public C15525e(String str) {
        this.ad = 3;
        AbstractC4265e.metrica(!TextUtils.isEmpty(str));
        this.vip = str;
        this.metrica = 1;
    }

    public C15525e(String str, int i) {
        this.ad = 1;
        Objects.requireNonNull(str);
        this.vip = str;
        this.metrica = i;
    }

    public /* synthetic */ C15525e(String str, int i, char c) {
        this.ad = i;
        this.vip = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15525e(String str, int i, int i2) {
        this(str, false, (i2 & 2) != 0 ? 0 : i);
        this.ad = 0;
    }

    public C15525e(String str, boolean z, int i) {
        this.ad = 0;
        this.vip = z ? AbstractC17861e.advert(')', "(", str) : str;
        this.metrica = z ? i + 1 : i;
    }

    public boolean ad(Function1 function1) {
        boolean yandex = yandex(function1);
        if (yandex) {
            this.metrica++;
        }
        return yandex;
    }

    public boolean appmetrica(char c) {
        int i = this.metrica;
        String str = this.vip;
        return i < str.length() && str.charAt(this.metrica) == c;
    }

    public String billing(String str) {
        String str2;
        int i = this.metrica;
        while (true) {
            int i2 = this.metrica;
            str2 = this.vip;
            if (i2 >= str2.length() || AbstractC5304e.isPro(str, str2.charAt(this.metrica))) {
                break;
            }
            this.metrica++;
        }
        int i3 = this.metrica;
        return i3 > i ? str2.substring(i, i3) : BuildConfig.FLAVOR;
    }

    public void license() {
        if (appmetrica(')')) {
            return;
        }
        startapp("expected )");
        throw null;
    }

    public boolean metrica() {
        return this.metrica >= this.vip.length();
    }

    public int purchase(String str) {
        Integer signatures = AbstractC6507e.signatures(billing(str));
        if (signatures != null) {
            return signatures.intValue();
        }
        startapp("expected int");
        throw null;
    }

    public void startapp(String str) {
        int i = this.metrica;
        String str2 = this.vip;
        int min = Math.min(i, str2.length());
        StringBuilder applovin = AbstractC8703e.applovin("Error while parsing source information: ", str, " at ");
        applovin.append(str2.substring(0, min));
        applovin.append('|');
        applovin.append(str2.substring(min));
        throw new C15925e(applovin.toString());
    }

    public String toString() {
        switch (this.ad) {
            case 1:
                return this.vip + ", uid: " + this.metrica;
            default:
                return super.toString();
        }
    }

    public void vip(Function1 function1) {
        if (yandex(function1)) {
            while (yandex(function1)) {
                this.metrica++;
            }
        }
    }

    public boolean yandex(Function1 function1) {
        int i = this.metrica;
        String str = this.vip;
        return i < str.length() && ((Boolean) function1.invoke(Character.valueOf(str.charAt(this.metrica)))).booleanValue();
    }
}
