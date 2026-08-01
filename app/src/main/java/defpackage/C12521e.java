package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12521e extends AbstractC17112e implements InterfaceC18435e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f25063e = AbstractC9743e.vip();

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final List f25064e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AbstractC15876e f25065e;

    public C12521e(AbstractC15876e abstractC15876e, List list) {
        this.f25065e = abstractC15876e;
        this.f25064e = list;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [eٍؚؔ, java.lang.Object] */
    @Override // defpackage.AbstractC17112e
    public final void ads(int i, InterfaceC10283e interfaceC10283e) {
        Object obj;
        Object obj2;
        List<Catalog2Button> list = this.f25064e;
        final int i2 = 0;
        final int i3 = 1;
        if (list.size() > 1) {
            Iterator it = list.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((Catalog2Button) obj2).ad instanceof C8799e) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (obj2 != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((Catalog2Button) next).ad instanceof C4582e) {
                        obj = next;
                        break;
                    }
                }
                if (obj != null) {
                    final C8721e c8721e = (C8721e) interfaceC10283e;
                    for (final Catalog2Button catalog2Button : list) {
                        if (catalog2Button.ad instanceof C8799e) {
                            for (final Catalog2Button catalog2Button2 : list) {
                                if (catalog2Button2.ad instanceof C4582e) {
                                    c8721e.f17585e.setOnClickListener(new View.OnClickListener(this) { // from class: eؙؔٓ

                                        /* renamed from: eؘٙؓ, reason: contains not printable characters */
                                        public final /* synthetic */ C12521e f6418e;

                                        {
                                            this.f6418e = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i2) {
                                                case 0:
                                                    Context context = c8721e.f17586e.getContext();
                                                    AbstractC15876e abstractC15876e = this.f6418e.f25065e;
                                                    if (abstractC15876e == null) {
                                                        return;
                                                    }
                                                    AbstractC0223e.startapp(context, abstractC15876e, catalog2Button);
                                                    return;
                                                default:
                                                    Context context2 = c8721e.f17586e.getContext();
                                                    AbstractC15876e abstractC15876e2 = this.f6418e.f25065e;
                                                    if (abstractC15876e2 == null) {
                                                        return;
                                                    }
                                                    AbstractC0223e.startapp(context2, abstractC15876e2, catalog2Button);
                                                    return;
                                            }
                                        }
                                    });
                                    c8721e.f17584e.setOnClickListener(new View.OnClickListener(this) { // from class: eؙؔٓ

                                        /* renamed from: eؘٙؓ, reason: contains not printable characters */
                                        public final /* synthetic */ C12521e f6418e;

                                        {
                                            this.f6418e = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i3) {
                                                case 0:
                                                    Context context = c8721e.f17586e.getContext();
                                                    AbstractC15876e abstractC15876e = this.f6418e.f25065e;
                                                    if (abstractC15876e == null) {
                                                        return;
                                                    }
                                                    AbstractC0223e.startapp(context, abstractC15876e, catalog2Button2);
                                                    return;
                                                default:
                                                    Context context2 = c8721e.f17586e.getContext();
                                                    AbstractC15876e abstractC15876e2 = this.f6418e.f25065e;
                                                    if (abstractC15876e2 == null) {
                                                        return;
                                                    }
                                                    AbstractC0223e.startapp(context2, abstractC15876e2, catalog2Button2);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
        int i4 = 4;
        if (((Catalog2Button) list.get(0)).ad instanceof C1461e) {
            ?? obj3 = new Object();
            boolean billing = AbstractC7890e.billing(((Catalog2Button) list.get(0)).adcel, Boolean.TRUE);
            obj3.f18534e = billing;
            C10499e c10499e = (C10499e) interfaceC10283e;
            C2109e c2109e = new C2109e(i2, c10499e);
            c2109e.invoke(Boolean.valueOf(billing));
            c10499e.f20719e.setOnClickListener(new ViewOnClickListenerC16710e(i4, (Object) obj3, this, c2109e));
            return;
        }
        if ((((Catalog2Button) list.get(0)).ad instanceof C16512e) || (((Catalog2Button) list.get(0)).ad instanceof Catalog2ButtonAction.OpenUrl)) {
            C18294e c18294e = (C18294e) interfaceC10283e;
            c18294e.f35941e.setText(((Catalog2Button) list.get(0)).yandex);
            c18294e.f35942e.setOnClickListener(new ViewOnClickListenerC0123e(4, this));
            return;
        }
        C17030e c17030e = (C17030e) interfaceC10283e;
        FrameLayout frameLayout = c17030e.f33363e;
        TextView textView = c17030e.f33361e;
        TextView textView2 = c17030e.f33364e;
        ImageView imageView = c17030e.f33362e;
        Catalog2Button catalog2Button3 = (Catalog2Button) list.get(0);
        Catalog2ButtonAction catalog2ButtonAction = catalog2Button3.ad;
        if (catalog2ButtonAction instanceof C9256e) {
            textView.setText(R.string.playlist_create_title);
            AbstractC17680e.mopub(textView2);
            imageView.setImageResource(R.drawable.ic_list_add_outline_28);
            VKXApplication.Companion companion = VKXApplication.f36531e;
            int ad = VKXApplication.Companion.ad(16.0f);
            imageView.setPadding(ad, ad, ad, ad);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            int ad2 = VKXApplication.Companion.ad(64.0f);
            layoutParams.height = ad2;
            layoutParams.width = ad2;
        } else if (catalog2ButtonAction instanceof C8799e) {
            textView.setText(R.string.mab_play);
            AbstractC17680e.mopub(textView2);
            imageView.setImageResource(R.drawable.player_play);
            VKXApplication.Companion companion2 = VKXApplication.f36531e;
            int ad3 = VKXApplication.Companion.ad(10.0f);
            imageView.setPadding(ad3, ad3, ad3, ad3);
        } else if (catalog2ButtonAction instanceof C4582e) {
            textView.setText(R.string.shuffle);
            AbstractC17680e.mopub(textView2);
            imageView.setImageResource(R.drawable.ic_shuffle_outline_28);
            VKXApplication.Companion companion3 = VKXApplication.f36531e;
            int ad4 = VKXApplication.Companion.ad(10.0f);
            imageView.setPadding(ad4, ad4, ad4, ad4);
        } else if (catalog2ButtonAction instanceof Catalog2ButtonAction.SynthCustomAction) {
            textView.setText(((Catalog2ButtonAction.SynthCustomAction) catalog2ButtonAction).ad);
            Catalog2ButtonAction.SynthCustomAction synthCustomAction = (Catalog2ButtonAction.SynthCustomAction) catalog2ButtonAction;
            textView2.setText(synthCustomAction.vip);
            String str = synthCustomAction.vip;
            if (str == null || str.length() == 0) {
                AbstractC17680e.mopub(textView2);
            } else {
                AbstractC17680e.amazon(textView2);
            }
            imageView.setImageResource(synthCustomAction.metrica);
            VKXApplication.Companion companion4 = VKXApplication.f36531e;
            int ad5 = VKXApplication.Companion.ad(10.0f);
            imageView.setPadding(ad5, ad5, ad5, ad5);
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            int ad6 = VKXApplication.Companion.ad(48.0f);
            layoutParams2.height = ad6;
            layoutParams2.width = ad6;
        }
        c17030e.f33365e.setOnClickListener(new ViewOnClickListenerC16710e(catalog2Button3, this, c17030e));
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f25063e.f29359e;
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return 1;
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object obj;
        Object obj2;
        List list = this.f25064e;
        if (list.size() > 1) {
            Iterator it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((Catalog2Button) obj2).ad instanceof C8799e) {
                    break;
                }
            }
            if (obj2 != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((Catalog2Button) next).ad instanceof C4582e) {
                        obj = next;
                        break;
                    }
                }
                if (obj != null) {
                    View inflate = layoutInflater.inflate(R.layout.v5_shuffler, viewGroup, false);
                    int i = R.id.play_normal;
                    MaterialButton materialButton = (MaterialButton) AbstractC7779e.vip(inflate, R.id.play_normal);
                    if (materialButton != null) {
                        i = R.id.play_shuffle;
                        MaterialButton materialButton2 = (MaterialButton) AbstractC7779e.vip(inflate, R.id.play_shuffle);
                        if (materialButton2 != null) {
                            return new C8721e((LinearLayout) inflate, materialButton, materialButton2);
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                }
            }
        }
        if (((Catalog2Button) list.get(0)).ad instanceof C1461e) {
            View inflate2 = layoutInflater.inflate(R.layout.c3_follow_owner, viewGroup, false);
            if (inflate2 != null) {
                return new C10499e((MaterialButton) inflate2);
            }
            throw new NullPointerException("rootView");
        }
        if ((((Catalog2Button) list.get(0)).ad instanceof C16512e) || (((Catalog2Button) list.get(0)).ad instanceof Catalog2ButtonAction.OpenUrl)) {
            View inflate3 = layoutInflater.inflate(R.layout.c3_button_mini, viewGroup, false);
            FrameLayout frameLayout = (FrameLayout) inflate3;
            TextView textView = (TextView) AbstractC7779e.vip(inflate3, R.id.text);
            if (textView != null) {
                return new C18294e(frameLayout, textView);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(R.id.text)));
        }
        View inflate4 = layoutInflater.inflate(R.layout.c3_buttons_shuffle, viewGroup, false);
        int i2 = R.id.card;
        FrameLayout frameLayout2 = (FrameLayout) AbstractC7779e.vip(inflate4, R.id.card);
        if (frameLayout2 != null) {
            i2 = R.id.shuffle_btn;
            ImageView imageView = (ImageView) AbstractC7779e.vip(inflate4, R.id.shuffle_btn);
            if (imageView != null) {
                i2 = R.id.shuffle_desc;
                TextView textView2 = (TextView) AbstractC7779e.vip(inflate4, R.id.shuffle_desc);
                if (textView2 != null) {
                    i2 = R.id.shuffle_txt;
                    TextView textView3 = (TextView) AbstractC7779e.vip(inflate4, R.id.shuffle_txt);
                    if (textView3 != null) {
                        return new C17030e((LinearLayout) inflate4, frameLayout2, imageView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i2)));
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        Object obj;
        Object obj2;
        List list = this.f25064e;
        if (list.size() > 1) {
            Iterator it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((Catalog2Button) obj2).ad instanceof C8799e) {
                    break;
                }
            }
            if (obj2 != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((Catalog2Button) next).ad instanceof C4582e) {
                        obj = next;
                        break;
                    }
                }
                if (obj != null) {
                    return R.layout.v5_shuffler;
                }
            }
        }
        return ((Catalog2Button) list.get(0)).ad instanceof C1461e ? R.layout.c3_follow_owner : ((((Catalog2Button) list.get(0)).ad instanceof C16512e) || (((Catalog2Button) list.get(0)).ad instanceof Catalog2ButtonAction.OpenUrl)) ? R.layout.c3_button_mini : R.layout.c3_buttons_shuffle;
    }
}
