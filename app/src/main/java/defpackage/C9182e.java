package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؑۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9182e implements Spannable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Spannable f18357e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f18358e = false;

    public C9182e(Spannable spannable) {
        this.f18357e = spannable;
    }

    public final void ad() {
        Spannable spannable = this.f18357e;
        if (!this.f18358e) {
            if ((Build.VERSION.SDK_INT < 28 ? new C7936e(11) : new C7936e(11)).billing(spannable)) {
                this.f18357e = new SpannableString(spannable);
            }
        }
        this.f18358e = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f18357e.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return AbstractC12026e.appmetrica(this.f18357e);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return AbstractC12026e.purchase(this.f18357e);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f18357e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f18357e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f18357e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f18357e.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f18357e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f18357e.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        ad();
        this.f18357e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        ad();
        this.f18357e.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f18357e.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f18357e.toString();
    }
}
