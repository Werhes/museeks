package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4853e implements InterfaceC10625e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f10314e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f10315e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f10316e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f10317e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1292e f10318e = new C1292e();

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f10319e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final float f10320e;

    public C4853e(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f10315e = 0;
            this.f10317e = -1;
            this.f10314e = "sans-serif";
            this.f10316e = false;
            this.f10320e = 0.85f;
            this.f10319e = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f10315e = bArr[24];
        this.f10317e = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f10314e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f10319e = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f10316e = z;
        if (z) {
            this.f10320e = AbstractC9413e.startapp(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f10320e = 0.85f;
        }
    }

    public static void ad(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void vip(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    @Override // defpackage.InterfaceC10625e
    public final /* synthetic */ void reset() {
    }

    @Override // defpackage.InterfaceC10625e
    /* renamed from: this */
    public final /* synthetic */ InterfaceC11455e mo823this(int i, int i2, byte[] bArr) {
        return AbstractC1786e.billing(this, bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC10625e
    /* renamed from: transient */
    public final void mo825transient(byte[] bArr, int i, int i2, C14033e c14033e, InterfaceC8427e interfaceC8427e) {
        String isPro;
        int i3;
        int i4;
        C1292e c1292e = this.f10318e;
        c1292e.m570throw(i + i2, bArr);
        c1292e.m571try(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        AbstractC2301e.billing(c1292e.ad() >= 2);
        int m565goto = c1292e.m565goto();
        if (m565goto == 0) {
            isPro = BuildConfig.FLAVOR;
        } else {
            int i8 = c1292e.vip;
            Charset m567native = c1292e.m567native();
            int i9 = m565goto - (c1292e.vip - i8);
            if (m567native == null) {
                m567native = StandardCharsets.UTF_8;
            }
            isPro = c1292e.isPro(i9, m567native);
        }
        if (isPro.isEmpty()) {
            C2171e c2171e = AbstractC17475e.f34223e;
            interfaceC8427e.accept(new C17169e(-9223372036854775807L, -9223372036854775807L, C1410e.f4222e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(isPro);
        vip(spannableStringBuilder, this.f10315e, 0, 0, spannableStringBuilder.length(), 16711680);
        ad(spannableStringBuilder, this.f10317e, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f10314e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f10320e;
        while (c1292e.ad() >= 8) {
            int i10 = c1292e.vip;
            int smaato = c1292e.smaato();
            int smaato2 = c1292e.smaato();
            if (smaato2 == 1937013100) {
                AbstractC2301e.billing(c1292e.ad() >= i7 ? i5 : i6);
                int m565goto2 = c1292e.m565goto();
                int i11 = i6;
                while (i11 < m565goto2) {
                    AbstractC2301e.billing(c1292e.ad() >= 12 ? i5 : i6);
                    int m565goto3 = c1292e.m565goto();
                    int m565goto4 = c1292e.m565goto();
                    c1292e.m568protected(i7);
                    int i12 = i11;
                    int ads = c1292e.ads();
                    c1292e.m568protected(i5);
                    int smaato3 = c1292e.smaato();
                    if (m565goto4 > spannableStringBuilder.length()) {
                        StringBuilder premium = AbstractC4653e.premium("Truncating styl end (", m565goto4, ") to cueText.length() (");
                        premium.append(spannableStringBuilder.length());
                        premium.append(").");
                        AbstractC2803e.smaato("Tx3gParser", premium.toString());
                        m565goto4 = spannableStringBuilder.length();
                    }
                    if (m565goto3 >= m565goto4) {
                        AbstractC2803e.smaato("Tx3gParser", AbstractC8647e.inmobi(m565goto3, m565goto4, "Ignoring styl with start (", ") >= end (", ")."));
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = m565goto4;
                        vip(spannableStringBuilder, ads, this.f10315e, m565goto3, i13, 0);
                        ad(spannableStringBuilder, smaato3, this.f10317e, m565goto3, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (smaato2 == 1952608120 && this.f10316e) {
                i3 = 2;
                AbstractC2301e.billing(c1292e.ad() >= 2);
                f = AbstractC9413e.startapp(c1292e.m565goto() / this.f10319e, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            c1292e.m571try(i10 + smaato);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        interfaceC8427e.accept(new C17169e(-9223372036854775807L, -9223372036854775807L, AbstractC17475e.ads(new C17817e(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0))));
    }
}
