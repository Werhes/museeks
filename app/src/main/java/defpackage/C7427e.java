package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7427e extends SpannableStringBuilder {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f15200e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Class f15201e;

    public C7427e(Class cls, C7427e c7427e, int i, int i2) {
        super(c7427e, i, i2);
        this.f15200e = new ArrayList();
        AbstractC4265e.billing(cls, "watcherClass cannot be null");
        this.f15201e = cls;
    }

    public C7427e(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f15200e = new ArrayList();
        AbstractC4265e.billing(cls, "watcherClass cannot be null");
        this.f15201e = cls;
    }

    public final void ad() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f15200e;
            if (i >= arrayList.size()) {
                return;
            }
            ((C17248e) arrayList.get(i)).f33784e.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public final void appmetrica() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f15200e;
            if (i >= arrayList.size()) {
                return;
            }
            ((C17248e) arrayList.get(i)).f33784e.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C17248e metrica;
        if (license(obj) && (metrica = metrica(obj)) != null) {
            obj = metrica;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C17248e metrica;
        if (license(obj) && (metrica = metrica(obj)) != null) {
            obj = metrica;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C17248e metrica;
        if (license(obj) && (metrica = metrica(obj)) != null) {
            obj = metrica;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f15201e != cls) {
            return super.getSpans(i, i2, cls);
        }
        C17248e[] c17248eArr = (C17248e[]) super.getSpans(i, i2, C17248e.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c17248eArr.length);
        for (int i3 = 0; i3 < c17248eArr.length; i3++) {
            objArr[i3] = c17248eArr[i3].f33785e;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public final boolean license(Object obj) {
        if (obj != null) {
            return this.f15201e == obj.getClass();
        }
        return false;
    }

    public final C17248e metrica(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f15200e;
            if (i >= arrayList.size()) {
                return null;
            }
            C17248e c17248e = (C17248e) arrayList.get(i);
            if (c17248e.f33785e == obj) {
                return c17248e;
            }
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f15201e == cls) {
            cls = C17248e.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C17248e c17248e;
        if (license(obj)) {
            c17248e = metrica(obj);
            if (c17248e != null) {
                obj = c17248e;
            }
        } else {
            c17248e = null;
        }
        super.removeSpan(obj);
        if (c17248e != null) {
            this.f15200e.remove(c17248e);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        ad();
        super.replace(i, i2, charSequence);
        appmetrica();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        ad();
        super.replace(i, i2, charSequence, i3, i4);
        appmetrica();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (license(obj)) {
            C17248e c17248e = new C17248e(obj);
            this.f15200e.add(c17248e);
            obj = c17248e;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C7427e(this.f15201e, this, i, i2);
    }

    public final void vip() {
        appmetrica();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f15200e;
            if (i >= arrayList.size()) {
                return;
            }
            ((C17248e) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }
}
